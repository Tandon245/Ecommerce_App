package Tandon.ecommerce.dao;

import Tandon.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Integer> {
}
