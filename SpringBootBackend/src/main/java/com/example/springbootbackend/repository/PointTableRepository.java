package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.PointTableEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointTableRepository extends JpaRepository<PointTableEntry, Long>{
}
