package com.example.docker.docker.repository;

import com.example.docker.docker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by DIPU on 12/6/21
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
