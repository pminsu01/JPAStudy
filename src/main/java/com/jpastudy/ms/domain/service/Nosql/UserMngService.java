package com.jpastudy.ms.domain.service.Nosql;

import com.msyd.speaklisten.dto.UserDto;

import org.springframework.stereotype.Service;

@Service
public interface UserMngService {

    public int doLoginUserCheck(UserDto userDto);
    public void signUpUserAcount(UserDto userDto);
    public void updateUserAcount(UserDto userDto);

}
