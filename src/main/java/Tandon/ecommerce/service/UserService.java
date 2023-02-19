package Tandon.ecommerce.service;

import Tandon.ecommerce.dao.IUserRepository;
import Tandon.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
IUserRepository repository;
public User saveUser(User user){
return repository.save(user);
}


}
