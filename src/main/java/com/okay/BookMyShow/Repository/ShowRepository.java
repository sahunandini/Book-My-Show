package com.okay.BookMyShow.Repository;


import com.okay.BookMyShow.Entities.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}