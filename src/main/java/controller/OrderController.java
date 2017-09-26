package controller;


import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/orders")

public class OrderController {

    @Autowired
    private OrderService orderService;

    @PutMapping
    public Order newOrder(@RequestBody List<Long> ids) {
        return orderService.createOrder(ids);
    }

    @GetMapping("/findAll")
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/findById")
    public Order findById(@RequestParam("id") Long id) {
        return orderService.findById(id);
    }

    @DeleteMapping("/deleteProduct")
    public void deleteProduct(@RequestParam("orderId") Long orderId, @RequestParam("productId") Long productId) {
        Order order = orderService.findById(orderId);
        order.getProducts().removeIf(product -> Objects.equals(product.getId(), productId));
        orderService.updateOrder(order);
    }
}
