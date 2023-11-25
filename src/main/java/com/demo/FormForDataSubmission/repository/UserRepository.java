package com.demo.FormForDataSubmission.repository;

import com.demo.FormForDataSubmission.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
