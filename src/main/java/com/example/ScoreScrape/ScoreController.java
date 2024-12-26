package com.example.ScoreScrape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ScoreController {
    @Autowired
    private ScraperService scraperService;

    @GetMapping("/api/score")
    public List<String> getScores() throws IOException {
        return scraperService.getScores();
    }
}

