package com.example.productapi.service_eureka_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {

        @Autowired
        UserRepository userRepository;

        @RequestMapping(value = "/createUser", method = RequestMethod.POST, consumes="application/json", produces="text/plain")
        @CrossOrigin(origins = "http://localhost:3000")
        public @ResponseBody String addNewUser (@RequestBody User user) {
       userRepository.save(user);
        return "Saved";
        }


    @GetMapping(path = "/getUserById")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody User getProductById (@RequestParam String email) {
        List<String> ids = new ArrayList<>();
        ids.add(email);
        User user = userRepository.findById(email).get();
        return user;
    }
}
