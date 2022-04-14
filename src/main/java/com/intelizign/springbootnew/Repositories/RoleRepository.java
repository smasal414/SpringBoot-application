package com.intelizign.springbootnew.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intelizign.springbootnew.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


}
