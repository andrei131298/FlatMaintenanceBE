package blocks.maintenance.controllers;

//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class UserController {

//    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("user")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @DeleteMapping("admin")
    public String deleteAdmin() {
        return "Delete Admin";
    }

}