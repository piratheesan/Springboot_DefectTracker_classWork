package com.pirathee.DefectTracker_SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pirathee.DefectTracker_SpringBoot.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
