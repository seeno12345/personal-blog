package com.example.blog.controller;

import com.example.blog.common.Result;
import com.example.blog.entity.Article;
import com.example.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // 新增文章
    @PostMapping("/add")
    public Result<Boolean> addArticle(@RequestBody Article article) {
        boolean save = articleService.save(article);
        return Result.success(save); // 修正：直接传 data，不用加多余括号
    }

    // 删除文章
    @DeleteMapping("/delete/{id}")
    public Result<Boolean> deleteArticle(@PathVariable Integer id) {
        boolean remove = articleService.removeById(id);
        return Result.success(remove);
    }

    // 修改文章
    @PutMapping("/update")
    public Result<Boolean> updateArticle(@RequestBody Article article) {
        boolean update = articleService.updateById(article);
        return Result.success(update);
    }

    // 根据ID查询文章
    @GetMapping("/get/{id}")
    public Result<Article> getArticleById(@PathVariable Integer id) {
        Article article = articleService.getById(id);
        return Result.success(article);
    }

    // 查询所有文章
    @GetMapping("/list")
    public Result<List<Article>> getArticleList() {
        List<Article> list = articleService.list();
        return Result.success(list);
    }
}