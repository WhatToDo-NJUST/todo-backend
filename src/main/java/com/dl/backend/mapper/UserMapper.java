package com.dl.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dl.backend.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
