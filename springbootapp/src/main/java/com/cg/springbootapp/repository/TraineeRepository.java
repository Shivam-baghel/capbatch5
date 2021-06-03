package com.cg.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springbootapp.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
