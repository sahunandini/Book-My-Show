package com.okay.BookMyShow.Repository;


import com.okay.BookMyShow.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
}
