package com.javatechie.ors.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.ors.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
