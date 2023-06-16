package com.example.apiquiz.controller;


import com.example.apiquiz.models.Ranking;
import com.example.apiquiz.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rankings")
public class RankingController {

    private final RankingService rankingService;

    @Autowired
    public RankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    @GetMapping
    public ResponseEntity<List<Ranking>> getAllRankings() {
        List<Ranking> rankings = rankingService.getAllRankings();
        return ResponseEntity.ok(rankings);
    }

    @GetMapping("/{place}")
    public ResponseEntity<Ranking> getRankingByPlace(@PathVariable long place) {
        Ranking ranking = rankingService.getRankingByPlace(place);
        if (ranking != null) {
            return ResponseEntity.ok(ranking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Ranking> createRanking(@RequestBody Ranking ranking) {
        Ranking createdRanking = rankingService.createRanking(ranking);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRanking);
    }

    @PutMapping("/{place}")
    public ResponseEntity<Ranking> updateRanking(@PathVariable long place, @RequestBody Ranking ranking) {
        Ranking updatedRanking = rankingService.updateRanking(place, ranking);
        if (updatedRanking != null) {
            return ResponseEntity.ok(updatedRanking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{place}")
    public ResponseEntity<Void> deleteRanking(@PathVariable long place) {
        boolean deleted = rankingService.deleteRanking(place);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

