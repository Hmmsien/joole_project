package com.itlize.Repository;


import com.itlize.Entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescriptionRepository extends JpaRepository<Description, Integer> {
}