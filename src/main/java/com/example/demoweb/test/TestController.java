package com.example.demoweb.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin
 */
@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {
    @GetMapping
    public ResponseEntity<Map<String, String>> test() {
        Map<String, String> map = new HashMap<>();
        map.put("data", "hello,world");
        return ResponseEntity.ok(map);
    }
}
