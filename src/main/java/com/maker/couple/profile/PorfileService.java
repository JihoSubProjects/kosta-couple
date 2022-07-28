package com.maker.couple.profile;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.maker.couple.domain.Profile;

@Service
public class PorfileService {

    private final ProfileRepository profileRepository;

    public PorfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    public Profile findById(Long id) {
        return profileRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Profile save(Profile profile) {
        return profileRepository.save(profile);
    }

    public void delete(Long id) {
        profileRepository.deleteById(id);
    }

}
