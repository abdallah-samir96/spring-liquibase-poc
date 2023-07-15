package com.abdallah.liquibasepoc.controller;

import com.abdallah.liquibasepoc.model.Order;
import com.abdallah.liquibasepoc.model.dto.OrderDTO;
import com.abdallah.liquibasepoc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){

        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody OrderDTO orderDTO){

        return ResponseEntity.ok(orderService.add(orderDTO));

    }

    @GetMapping
    public ResponseEntity<List<Order>> list(){

        return ResponseEntity.ok(orderService.list());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Order> getById(@PathVariable(name = "id") long id){

        return  ResponseEntity.ok(orderService.getById(id));
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> removeById(@PathVariable(name = "id") long id){

        return  ResponseEntity.ok(orderService.removeById(id));
    }
}
