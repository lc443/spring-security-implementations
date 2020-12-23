package com.leron.repository;

import com.leron.auth.ApplicationUser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserDao  {
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
