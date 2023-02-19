package Tandon.ecommerce.service;

import Tandon.ecommerce.dao.IAddressRepository;
import Tandon.ecommerce.model.Address;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
@Autowired
IAddressRepository repository;
    public Address saveProduct(Address address){
        return repository.save(address);
    }

    public JSONArray getAddress(){
        List<Address>addressList=repository.findAll();
JSONArray addressArr= new JSONArray();
for(Address address:addressList){
    JSONObject json=new JSONObject();
json.put("addressId",address.getAddressId());
    json.put("addressName",address.getAddressName());
    json.put("landmark",address.getLandmark());
    json.put("",address.getAddressId());
    json.put("addressId",address.getAddressId());


}

    }
}
