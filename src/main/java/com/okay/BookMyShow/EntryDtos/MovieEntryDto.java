package com.okay.BookMyShow.EntryDtos;


import com.okay.BookMyShow.Enums.Genre;
import com.okay.BookMyShow.Enums.Language;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}