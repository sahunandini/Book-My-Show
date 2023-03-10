package com.okay.BookMyShow.Convertors;

import com.okay.BookMyShow.Entities.UserEntity;
import com.okay.BookMyShow.EntryDtos.UserEntryDto;

public class UserConvertors {

    //Static is kept to avoid calling it via objects/instances
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                .build();

        return userEntity;

    }

}