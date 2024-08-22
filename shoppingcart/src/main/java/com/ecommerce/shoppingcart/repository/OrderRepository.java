package com.ecommerce.shoppingcart.repository;

import com.ecommerce.shoppingcart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
