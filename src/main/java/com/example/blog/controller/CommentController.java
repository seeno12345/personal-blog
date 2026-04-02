package com.example.blog.controller;

import com.example.blog.common.Result;
import com.example.blog.entity.Comment;
import com.example.blog.service.CommentService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    CommentService service;

    @GetMapping("/list")
    public Result list(@RequestParam Integer articleId) {
        return Result.success(service.list(articleId));
    }

    @PostMapping("/add")
    public Result add(@RequestBody Comment comment) {
        return Result.success(service.add(comment));
    }
}