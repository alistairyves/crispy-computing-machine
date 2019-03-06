package com.alistairyves.crispycomputingmachine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PodcastController {

    @GetMapping("/podcast")
    String test(){
        return "Hello Podcast Mapping";
    }
}
