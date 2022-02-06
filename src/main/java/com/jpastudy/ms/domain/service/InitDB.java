//package com.jpastudy.ms.domain.service;
//
//import com.jpastudy.ms.domain.Entity.FoodEntity;
//import com.jpastudy.ms.domain.Entity.StoreEntity;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//import javax.persistence.Id;
//
////@Component
//@RequiredArgsConstructor
//class InitDb {
//    private final InitService initService;
//
////    @PostConstruct
//    public void init() {
//        initService.dbInit1();
//
//    }
//
//    @Component
//    @Transactional
//    @RequiredArgsConstructor
//    static class InitService {
//
//    private final EntityManager em;
//
//    public void dbInit1() {
//
//        StoreEntity meatStore = createStoreEntity("제주돌돗촌","0311231234","경기도 고양시");
//        StoreEntity fishStore = createStoreEntity("바다회사랑","0298765432","서울시 서대문구");
//
//        em.persist(meatStore);
//        em.persist(fishStore);
//
//        FoodEntity meatFood01  = createFoodEntity("삼겹살","300",meatStore);
//        FoodEntity meatFood02  = createFoodEntity("오겹살","400",meatStore);
//        FoodEntity meatFood03  = createFoodEntity("항정상","500",meatStore);
//        FoodEntity meatFood04  = createFoodEntity("냉면(물/비빔)","600",meatStore);
//
//        em.persist(meatFood01);
//        em.persist(meatFood02);
//        em.persist(meatFood03);
//        em.persist(meatFood04);
//
//
//        FoodEntity fishFood01  = createFoodEntity("대방어","300",fishStore);
//        FoodEntity fishFood02  = createFoodEntity("광어","400",fishStore);
//        FoodEntity fishFood03  = createFoodEntity("우럭","500",fishStore);
//        FoodEntity fishFood04  = createFoodEntity("참치","600",fishStore);
//
//
//
//        em.persist(fishFood01);
//        em.persist(fishFood02);
//        em.persist(fishFood03);
//        em.persist(fishFood04);
//
//
//        em.close();
//
//
//        }
//
//
//        private StoreEntity createStoreEntity(String storeName, String storeNumber, String address){
//
//            StoreEntity storeEntity = new StoreEntity();
//            storeEntity.setStoreName(storeName);
//            storeEntity.setStoreNumber(storeNumber);
//            storeEntity.setAddress(address);
//            return storeEntity;
//        }
//
//
//
//        private FoodEntity createFoodEntity(String foodName, String foodCalorie, StoreEntity storeEntity){
//            FoodEntity foodEntity = new FoodEntity();
//            foodEntity.setFoodName(foodName);
//            foodEntity.setFoodCalorie(foodCalorie);
//            foodEntity.setStoreEntity(storeEntity);
//            return foodEntity;
//        }
//
//
//    }
//}
//
//
//
