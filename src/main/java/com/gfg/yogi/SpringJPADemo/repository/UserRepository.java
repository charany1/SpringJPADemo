package com.gfg.yogi.SpringJPADemo.repository;

import com.gfg.yogi.SpringJPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
