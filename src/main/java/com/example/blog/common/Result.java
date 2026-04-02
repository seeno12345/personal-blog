package com.example.blog.common;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    // 无参构造
    public Result() {}

    // 全参构造（解决报错核心）
    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 成功返回（固定 code=200）
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "操作成功", data);
    }

    // 失败返回
    public static <T> Result<T> fail(int code, String msg) {
        return new Result<>(code, msg, null);
    }
}