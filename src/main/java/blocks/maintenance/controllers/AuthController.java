package blocks.maintenance.controllers;

import blocks.maintenance.model.User;
import blocks.maintenance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("sign-up")
    public ResponseEntity<User> signUpUser(@RequestBody User user){
        return ResponseEntity.ok().body(
        userRepository.save(user));

    }
}
