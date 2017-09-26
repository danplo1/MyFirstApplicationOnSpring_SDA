package controller;


import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;


@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PutMapping
    public Order newOrder(@RequestBody List<Long> ids) {
        return orderService.create(ids);
    }

    @DeleteMapping
    public Order removeProduct(@RequestParam Long orderId, @RequestParam Long productId) {
        return orderService.removeProduct(orderId, productId);
    }

}