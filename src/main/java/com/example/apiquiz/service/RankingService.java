package com.example.apiquiz.service;


import com.example.apiquiz.models.Ranking;
import com.example.apiquiz.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RankingService {

    private final RankingRepository rankingRepository;

    @Autowired
    public RankingService(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    public List<Ranking> getAllRankings() {
        return rankingRepository.findAll();
    }

    public Ranking getRankingByPlace(long place) {
        Optional<Ranking> rankingOptional = rankingRepository.findByPlace(place);
        return rankingOptional.orElse(null);
    }

    public Ranking createRanking(Ranking ranking) {
        return rankingRepository.save(ranking);
    }

    public Ranking updateRanking(long place, Ranking updatedRanking) {
        Optional<Ranking> rankingOptional = rankingRepository.findByPlace(place);
        if (rankingOptional.isPresent()) {
            Ranking ranking = rankingOptional.get();
            ranking.setPoints(updatedRanking.getPoints());
            ranking.setUserRank(updatedRanking.getUserRank());
            return rankingRepository.save(ranking);
        } else {
            return null;
        }
    }

    public boolean deleteRanking(long place) {
        Optional<Ranking> rankingOptional = rankingRepository.findByPlace(place);
        if (rankingOptional.isPresent()) {
            rankingRepository.deleteById(place);
            return true;
        } else {
            return false;
        }
    }
}

