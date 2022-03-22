package com.jpastudy.ms.domain.Entity.Nosql;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Document(collection = "UserMng")
@Entity
public class UserEntity {


    @Id
    private String id;

    private String accessToken;
    private String freshToken;
    private String thirdParty;
    private String sex;
    private int age;
    private boolean pushYN;
    private LocalDateTime expireDate;


    @Override
    public String toString() {
        return "UserDto [accessToken=" + accessToken + ", age=" + age + ", expireTime=" + expireDate + ", freshToken="
                + freshToken + ", id=" + id + ", pushYN=" + pushYN + ", sex=" + sex + ", thirdParty=" + thirdParty
                + "]";
    }

}
