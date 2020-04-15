package com.JsonStringTest.JsonStringTest.service;

import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class SpringParsingServiceImpl implements StringParsingService {
    @Override
    public Map<String, Integer> getWords(String input) {
        var response = new LinkedHashMap<String, Integer>();

        var words = input.strip().replaceAll("\\s+"," ").split(" ");

        for (var word: words) {
            response.compute(word, (k, v) -> (v == null) ? 1 : v + 1);
           /* if (response.containsKey(word)) {
                response.put(word, response.get(word) + 1);
            } else {
                response.put(word, 1);
            }*/
        }

        return response;
    }
}
