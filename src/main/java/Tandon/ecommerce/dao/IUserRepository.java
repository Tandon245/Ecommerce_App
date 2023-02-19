package Tandon.ecommerce.dao;

import Tandon.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
