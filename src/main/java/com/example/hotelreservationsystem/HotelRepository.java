package com.example.hotelreservationsystem;

import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository<Hotel, Long> {}