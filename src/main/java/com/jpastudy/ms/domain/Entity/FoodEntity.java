package com.jpastudy.ms.domain.Entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "tb_test_food")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="food_id")
    private Long foodId;

    private String foodName;
    private String foodCalorie;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_id")
    public StoreEntity storeEntity;

}
