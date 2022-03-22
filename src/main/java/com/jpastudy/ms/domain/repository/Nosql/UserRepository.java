package com.jpastudy.ms.domain.repository.Nosql;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jpastudy.ms.domain.Entity.Nosql.UserEntity;
import com.msyd.speaklisten.dto.UserDto;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<UserEntity, String> {

}