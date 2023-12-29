package com.example.CHIBANIAN.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CHIBANIAN.entity.Reservation;
import com.example.CHIBANIAN.entity.User;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    public Page<Reservation> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);

}