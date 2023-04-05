package com.example.cartmicroservice.Repository;

import com.example.cartmicroservice.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByUserId(Long id);
}
