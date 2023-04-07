/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.all.springbootSecurity.Repository;

import com.all.springbootSecurity.Model.role;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author anhha
 */
public interface RoleRepository extends JpaRepository<role, Integer>{
     @Query( "select u.role from role u  where u.role =:ro" )
     public List<String> findByRoles(@Param("ro") int roles);
}
