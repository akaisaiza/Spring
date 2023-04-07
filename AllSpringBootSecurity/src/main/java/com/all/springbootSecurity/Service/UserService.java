/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.all.springbootSecurity.Service;

import com.all.springbootSecurity.Model.user;
import com.all.springbootSecurity.Repository.RoleRepository;
import com.all.springbootSecurity.Repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author anhha
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user u = this.userRepository.findUserAccount(username);
        System.out.println("Found User: " + u);
        if (u == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }else{

       
        List<String> roleNames = this.roleRepository.findByRoles(u.getUser_id());
        List<GrantedAuthority> grantList = new ArrayList<>();

        if (roleNames != null) {
            for (String role : roleNames) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }
       
        UserDetails userDetails = (UserDetails) new User(u.getName(), u.getEncrytedPassword(), grantList);

        return userDetails;
    }
    }

}
