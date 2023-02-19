package Tandon.ecommerce.dao;

import Tandon.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Integer> {
}
