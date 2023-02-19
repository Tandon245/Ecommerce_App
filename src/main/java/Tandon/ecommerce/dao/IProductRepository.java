package Tandon.ecommerce.dao;

import Tandon.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
