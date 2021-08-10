package com.example.orderservice.controller;

import com.example.catalogservice.entity.CatalogEntity;
import com.example.catalogservice.service.CatalogService;
import com.example.catalogservice.vo.ResponseCatalog;
import com.example.orderservice.service.OrderService;
import com.example.orderservice.vo.RequestOrder;
import com.example.orderservice.vo.ResponseOrder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order-service")
public class OrderController {
    private Environment env;
    OrderService orderService;

    @Autowired
    public OrderController(Environment env,
                           OrderService orderService){
        this.env = env;
        this.orderService = orderService;
    }

    @GetMapping("/health_check")
    public String status(HttpServletRequest request){
        return String.format("Service on port %s", request.getServerPort());
    }

    @PostMapping("/{userId}/orders")
    public ResponseEntity<ResponseOrder> createOrder(@PathVariable("userId") String userId,
                                                     @RequestBody RequestOrder orderDetails){
      Model
    }
}
