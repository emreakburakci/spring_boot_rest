package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Runtime;

import java.util.List;


@Repository
public interface RuntimeRepository extends  JpaRepository<Runtime, Long> {

}
