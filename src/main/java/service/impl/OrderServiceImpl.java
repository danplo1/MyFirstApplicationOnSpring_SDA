package service.impl;


import model.Order;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.OrderRepository;
import repository.ProductRepository;
import service.OrderService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@Transactional
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    public Order create(List<Long> productIds) {
        Set<Product> products = productRepository.findByIdIn(productIds);
        Order order = new Order();
        order.setProducts(products);
        order.setTotalPrice(products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add));

        return orderRepository.save(order);
    }

    @Override
    public Order removeProduct(Long orderId, Long productId) {
        Order order = orderRepository.findOne(orderId);
        order.getProducts().removeIf(p -> p.getId().equals(productId));
        return orderRepository.save(order);
    }
}
