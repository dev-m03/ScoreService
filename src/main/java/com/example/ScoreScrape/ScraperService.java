package com.example.ScoreScrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScraperService {
    public List<String> getScores() throws IOException {
        List<String> scores = new ArrayList<>();
        Document doc = Jsoup.connect("www.urURL.com").get();
        Elements scoreElements = doc.select("enter the css selector here");
        scoreElements.forEach(element -> scores.add(element.text()));
        return scores;
    }
}
