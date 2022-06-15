package com.dl.backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dl.backend.entity.Todo;
import com.dl.backend.entity.result.ResultBean;
import com.dl.backend.service.ITodoService;
import com.dl.backend.util.JWTUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@Api("待办事项")
public class TodoController {
    @Autowired
    ITodoService todoService;
    @GetMapping("download")
    @ApiOperation(value = "请求所有个人todo", notes = "请求所有个人todo")
    public ResultBean<List<Todo>> userTodos(@RequestHeader String token) {
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId", JWTUtils.getIdByToken(token));
        List<Todo> todos = todoService.list(queryWrapper);
        return ResultBean.success(todos);
    }
    @PostMapping("upload")
    @ApiOperation(value = "更新个人todo", notes = "更新个人todo")
    public ResultBean<Boolean> updateTodos(@RequestHeader String token,@RequestBody List<Todo> todos) {
        for (Todo todo : todos) {
            todoService.saveOrUpdate(todo);
        }
        return ResultBean.success(true);
    }
}
