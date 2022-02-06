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
@Table(name = "tb_test_store")
public class StoreEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "store_id")
    private Long storeId;

    private String storeName;
    private String storeNumber;
    private String address;


}
