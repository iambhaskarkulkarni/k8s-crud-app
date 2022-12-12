package com.alphadev.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping(value = "/save")
    public Order saveOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping(value = "/list")
    public List<Order> getOrderList() {
        return orderRepository.findAll();
    }

    @GetMapping
    public Order getOrderById(@PathVariable Integer id) {
        return orderRepository.getReferenceById(id);
    }
}
