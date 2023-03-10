package com.okay.BookMyShow.Services;


import com.okay.BookMyShow.Convertors.UserConvertors;
import com.okay.BookMyShow.Entities.UserEntity;
import com.okay.BookMyShow.EntryDtos.UserEntryDto;
import com.okay.BookMyShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertors.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
