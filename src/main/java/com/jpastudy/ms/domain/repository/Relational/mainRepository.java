package com.jpastudy.ms.domain.repository.Relational;

import com.jpastudy.ms.domain.Entity.Relational.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mainRepository extends JpaRepository<FoodEntity, String> {
}
