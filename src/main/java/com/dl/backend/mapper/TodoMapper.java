package com.dl.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dl.backend.entity.Todo;
import org.mapstruct.Mapper;

@Mapper
public interface TodoMapper extends BaseMapper<Todo> {
}
