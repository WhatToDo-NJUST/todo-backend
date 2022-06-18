package com.dl.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("todo_todo")
@ApiModel(value = "Todo对象", description = "")
@JsonInclude(JsonInclude.Include.NON_NULL)	//注解控制null不序列化.因为Android端如果使用kotlin不可空类型的话，会出现类型错误
public class Todo {
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty("用户ID")
    private int userId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("优先级")
    private String priority;

    @ApiModelProperty("详细描述")
    private String description;

    @ApiModelProperty("是否完成")
    private Boolean isDone;

    @ApiModelProperty("待办时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")//加这个保证返回json是不是数组。可以对比updateTime
    private LocalDateTime registerTime;
}
