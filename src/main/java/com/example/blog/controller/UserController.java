package com.example.blog.controller;

import com.example.blog.common.Result;
import com.example.blog.entity.User;
import com.example.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录（简化版）
     */
    @PostMapping("/login")
    public Result<Boolean> login(@RequestBody User user) {
        List<User> list = userService.list();
        for (User u : list) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                return Result.success(true);
            }
        }
        return Result.success(false);
    }

    /**
     * 新增用户
     */
    @PostMapping("/add")
    public Result<Boolean> addUser(@RequestBody User user) {
        return Result.success(userService.save(user));
    }
}