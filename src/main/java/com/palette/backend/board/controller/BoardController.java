package com.palette.backend.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/board")
public class BoardController {

    @GetMapping("/list")
    public String test() {
        return "test";
    }

}
