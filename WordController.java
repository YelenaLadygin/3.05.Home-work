package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class WordController {
        @GetMapping("/counter")
        public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
            return String.format("%d",name.length());
        }

        @GetMapping("/concat")
        public String concat(@RequestParam(value = "word1",
                defaultValue = "0") String word1,
                          @RequestParam(value = "word2",
                                  defaultValue = "0") String word2) {
            return String.format("%s  %s ",word1,word2 );
        }     }


