package com.intelizign.springbootnew.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intelizign.springbootnew.entity.Project;




@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>
{

}
