package com.JsonStringTest.JsonStringTest.api;

import com.JsonStringTest.JsonStringTest.logic.JsonLogic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.util.Map;

@RequestMapping("/api/v1/jsonstring")

@RestController
public class JsonController {

    @GetMapping()
    public Map<String, String> getJson(@RequestBody @Valid @NotNull String str){
        JsonLogic j = new JsonLogic();
        return j.getStringToJson(str);
    }


}
