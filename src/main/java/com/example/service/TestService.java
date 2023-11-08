package com.example.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TestService {

    public Map<String, Integer> getSymbolFrequency(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = str.split("");

        for (String string : strings) {
            map.merge(string, 1, Integer::sum);
        }

        return map.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}