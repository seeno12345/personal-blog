package com.example.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.blog.entity.Comment;
import com.example.blog.mapper.CommentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentService {

    @Resource
    CommentMapper mapper;

    public List<Comment> list(Integer articleId) {
        QueryWrapper<Comment> qw = new QueryWrapper<>();
        qw.eq("article_id", articleId);
        return mapper.selectList(qw);
    }

    public boolean add(Comment comment) {
        return mapper.insert(comment) > 0;
    }
}