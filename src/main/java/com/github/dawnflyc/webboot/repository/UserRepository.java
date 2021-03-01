package com.github.dawnflyc.webboot.repository;

import com.github.dawnflyc.webboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
