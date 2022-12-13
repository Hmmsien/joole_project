package com.itlize.Repository;


import com.itlize.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository <Project, Integer> {

}
