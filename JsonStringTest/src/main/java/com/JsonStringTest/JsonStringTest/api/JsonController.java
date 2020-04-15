package com.JsonStringTest.JsonStringTest.api;

import com.JsonStringTest.JsonStringTest.service.JsonService;
import com.JsonStringTest.JsonStringTest.service.StringParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/api/v1/jsonstring")
@RestController
public class JsonController {

    @Autowired
    private StringParsingService stringParsingService;

    @GetMapping
    public Map<String, Integer> getJson(@RequestParam(required = true) String str){
        return stringParsingService.getWords(str);
    }

    @GetMapping("/old")
    public Map<String, String> getJsonOld(@RequestParam(required = true) String str){
        JsonService jsonService = new JsonService();
        return jsonService.getStringToJson(str);
    }
}
