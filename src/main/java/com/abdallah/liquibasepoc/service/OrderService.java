package com.abdallah.liquibasepoc.service;

import com.abdallah.liquibasepoc.model.Order;
import com.abdallah.liquibasepoc.model.dto.OrderDTO;
import com.abdallah.liquibasepoc.model.exceptions.NotFoundException;
import com.abdallah.liquibasepoc.model.mapper.OrderMapper;
import com.abdallah.liquibasepoc.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;


    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    public String add(OrderDTO orderDTO){

        var mapper = new OrderMapper();
        var order = mapper.toEntity(orderDTO);
        orderRepository.save(order);
        return "ok";
    }

    public List<Order> list() {
        return orderRepository.findAll();
    }

    public Order getById(long id){

      var orderOptional = orderRepository.findById(id);
      return orderOptional.orElseThrow(()-> new NotFoundException("Order with id "+ id + " IS not Found",404));
    }

    public String removeById(long id ){
        var orderOptional = orderRepository.findById(id);
        if (orderOptional.isEmpty())
          throw  new NotFoundException("Order with id "+ id + " IS not Found",404);

    orderRepository.delete(orderOptional.get());
    return "Deleted";

    }


}
