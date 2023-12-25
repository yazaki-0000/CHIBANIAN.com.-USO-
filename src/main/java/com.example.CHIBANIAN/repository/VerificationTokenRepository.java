package com.example.CHIBANIAN.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CHIBANIAN.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository< VerificationToken, Integer> {
    public VerificationToken findByToken(String token);

}
