package com.okay.BookMyShow.Services;

import com.okay.BookMyShow.Convertors.MovieConvertors;
import com.okay.BookMyShow.Entities.MovieEntity;
import com.okay.BookMyShow.EntryDtos.MovieEntryDto;
import com.okay.BookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}