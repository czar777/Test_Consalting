package com.example.controller;

import com.example.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/getSymbolFrequency")
    public Map<String, Integer> getSymbolFrequency(String str) {
        return testService.getSymbolFrequency(str);
    }
}
