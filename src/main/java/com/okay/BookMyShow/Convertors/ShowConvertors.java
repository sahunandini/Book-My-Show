package com.okay.BookMyShow.Convertors;

import com.okay.BookMyShow.Entities.ShowEntity;
import com.okay.BookMyShow.EntryDtos.ShowEntryDto;

public class ShowConvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}