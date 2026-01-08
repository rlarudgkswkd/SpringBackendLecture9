package com.example.Head04_JCF.example04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        // 학생별 점수 정보
        Map<String, String> scores = new HashMap<>();
        scores.put("Kim", "김경한");
        scores.put("Lee", "이종호");
        scores.put("Park", "박성호");

        // Map.Entry<String, String> -> 문자열 변환
        Function<Map.Entry<String, String>, String> entryToString =
                new Function<Map.Entry<String, String>, String>() {
                    @Override
                    public String apply(Map.Entry<String, String> e) {
                        return e.getKey() + ": " + e.getValue().substring(1,3);
                    }
                };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println("Student Info: " + result));
    }
}

