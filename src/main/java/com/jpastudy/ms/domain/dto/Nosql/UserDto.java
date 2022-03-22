package com.jpastudy.ms.domain.dto.Nosql;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {
    private String accessToken;
    private String freshToken;
    private String thirdParty;
    private String sex;
    private int age;
    private boolean pushYN;
    private LocalDateTime expireDate;

}
