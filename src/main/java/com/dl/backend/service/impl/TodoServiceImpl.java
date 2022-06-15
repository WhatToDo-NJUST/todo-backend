package com.dl.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dl.backend.entity.Todo;
import com.dl.backend.mapper.TodoMapper;
import com.dl.backend.service.ITodoService;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl  extends ServiceImpl<TodoMapper, Todo> implements ITodoService {
}
