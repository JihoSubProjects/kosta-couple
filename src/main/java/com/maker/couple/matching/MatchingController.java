package com.maker.couple.matching;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maker.couple.domain.Matching;

@RestController
@RequestMapping("/matching")
public class MatchingController {

    @GetMapping("/{profile_id}")
    public List<Matching> fetchAllMatchings(@PathVariable("profile_id") Long profileId) {
        return new ArrayList<>();
    }

    @GetMapping("/{profile_id}/raise")
    public List<Matching> fetchSendMathings(@PathVariable("profile_id") Long profileId) {
        return new ArrayList<>();
    }

    @GetMapping("/{profile_id}/call")
    public List<Matching> fetchReceivedMathings(@PathVariable("profile_id") Long profileId) {
        return new ArrayList<>();
    }

}
