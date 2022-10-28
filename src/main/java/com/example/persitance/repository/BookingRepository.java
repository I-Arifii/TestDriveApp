package com.example.persitance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.persitence.domain.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{ 

//	@Query("select b from Booking b where b.brand=?1")
//	Optional<Booking> bookingByName(String brand);
//	
}
