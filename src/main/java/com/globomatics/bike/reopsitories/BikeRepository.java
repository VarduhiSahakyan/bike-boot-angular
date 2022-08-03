package com.globomatics.bike.reopsitories;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
