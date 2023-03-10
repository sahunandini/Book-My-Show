package com.okay.BookMyShow.Convertors;

import com.okay.BookMyShow.Entities.TheaterEntity;
import com.okay.BookMyShow.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}