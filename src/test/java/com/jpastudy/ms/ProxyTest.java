package com.jpastudy.ms;


import com.jpastudy.ms.domain.Entity.FoodEntity;
import com.jpastudy.ms.domain.Entity.StoreEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@SpringBootTest
public class ProxyTest {


    @Autowired
    private EntityManager em;



    @Test
    @Transactional
    public void proxyTest(){

        FoodEntity foodEntity = em.find(FoodEntity.class,5L); // food_id 값이 5L인 데이터를 찾는다.
        System.out.println("======= 쿼리 전송 =======");

        System.out.println("Food Proxy ? Entity : " + foodEntity.getClass());
        System.out.println("Food ID : " +foodEntity.getFoodId());
        System.out.println("Food Name : " + foodEntity.getFoodName());
        System.out.println("Food Calorie : " + foodEntity.getFoodCalorie());


        System.out.println("Store Proxy ? Entity : " + foodEntity.getStoreEntity().getClass());


        System.out.println("======= 쿼리 결과 =======");

        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");

        System.out.println("======= Store 데이터 =======");
        System.out.println("Store ID : " + foodEntity.getStoreEntity().getStoreId());
        System.out.println("Store Name : " + foodEntity.getStoreEntity().getStoreName());
        System.out.println("Store Address : " + foodEntity.getStoreEntity().getAddress());
        System.out.println("Store Number : " + foodEntity.getStoreEntity().getStoreNumber());

        em.close();
    }
}
