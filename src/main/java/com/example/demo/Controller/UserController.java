package com.example.demo.Controller;

import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.Doc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("login")
    public String Login(@RequestParam String username,@RequestParam String password,
                         HttpServletRequest request) throws Exception{
        User user = userService.login(username,password);
        System.out.println(user);
        return "login right";
    }

    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable int id){
        System.out.println(id);
        return "删除用户";
    }
}
