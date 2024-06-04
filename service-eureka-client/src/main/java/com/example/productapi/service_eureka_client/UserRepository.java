package com.example.productapi.service_eureka_client;

import com.example.productapi.service_eureka_client.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String> {

}