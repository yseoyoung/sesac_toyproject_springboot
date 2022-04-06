package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>,
        QuerydslPredicateExecutor<Item>, ItemRepositoryCustom{

    // 이름으로 상품 조회
    List<Item> findByItemName(String itemName);

    // 상품명과 상품 상세 설명을 OR 조건을 이용하여 조회
    List<Item> findByItemNameOrItemDetail(String itemName, String itemDetail);

    // 파라미터로 넘어온 price 변수보다 값이 작은 상품 데이터 조회
    List<Item> findByPriceLessThan(Integer price);

    // 가격이 높은 순으로 조회
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    // Query를 이용한 상품 조회
    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);

}
