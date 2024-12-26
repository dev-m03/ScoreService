package com.example.ScoreScrape;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScorePageController {
    @GetMapping("/score")
    public String showScores(Model model) {
        return "scores";
    }
}

