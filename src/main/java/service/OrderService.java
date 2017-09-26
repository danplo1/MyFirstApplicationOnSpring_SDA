package service;

import model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();
    Order findById (Long id);
    Order create (List<Long> productIds);
    Order removeProduct (Long overId, Long productId);

}
