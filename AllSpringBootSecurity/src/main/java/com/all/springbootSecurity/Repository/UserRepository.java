/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.all.springbootSecurity.Repository;

import com.all.springbootSecurity.Model.user;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author anhha
 */

public interface UserRepository extends JpaRepository<user,Integer>{
     @Query( "select u from user u  where u.name =:name" )
     user findUserAccount(@Param("name")String userName);
     
}
