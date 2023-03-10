package com.okay.BookMyShow.Repository;


import com.okay.BookMyShow.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}