package com.cillin.cloud.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cillin.cloud.study.entity.User;

/**
 * @author mazb
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
