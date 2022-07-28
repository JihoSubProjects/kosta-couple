package com.maker.couple.profile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maker.couple.domain.Profile;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping
    public List<Profile> fetchProfiles() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public Profile fetchProfile(@PathVariable("id") Long id) {
        return new Profile();
    }

    @PostMapping
    public Profile insertProfile(@RequestBody Object profile) {
        return new Profile();
    }

    @PutMapping("/{id}")
    public Profile updateProfile(@PathVariable("id") Long id, @RequestBody Object profile) {
        return new Profile();
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable("id") Long id) {
        return;
    }

}
