package com.example.demo.repository;

import com.example.demo.model.Workcenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkcenterRepository extends JpaRepository<Workcenter, Long>{
}
