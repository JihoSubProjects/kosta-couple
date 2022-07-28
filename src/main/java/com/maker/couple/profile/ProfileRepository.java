package com.maker.couple.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maker.couple.domain.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {}
