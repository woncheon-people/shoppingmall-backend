package com.woncheonpeople.shoppingmall.repository;

import com.woncheonpeople.shoppingmall.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<Order, Long> {
}
