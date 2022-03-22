package com.jpastudy.ms.domain.service.Nosql.impl;

import com.jpastudy.ms.domain.repository.Nosql.UserRepository;
import com.msyd.speaklisten.dto.UserDto;
import com.msyd.speaklisten.repository.UserDtoRepo;

import com.msyd.speaklisten.service.UserMngService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserMngService")
public class UserMngServiceImpl implements UserMngService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void create(UserDto userDto) {


        userRepository.insert(userDto);
        System.out.println("create Data");
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(UserDto userDto) {

        userRepository.delete(userDto);

        // TODO Auto-generated method stub

    }

    @Override
    public void update(UserDto userDto) {
        userRepository.delete(userDto);
        // TODO Auto-generated method stub

    }

    @Override
    public UserDto find(UserDto userDto) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
