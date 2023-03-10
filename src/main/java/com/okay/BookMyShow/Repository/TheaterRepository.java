package com.okay.BookMyShow.Repository;


import com.okay.BookMyShow.Entities.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}