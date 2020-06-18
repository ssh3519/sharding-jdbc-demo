package com.atguigu.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: ssh
 * @email: 18367183519@163.com
 * @Date: 2020/6/18 0018 20:58
 */
@Data
@TableName(value = "t_user")
public class User {
    private Long userId;
    private String username;
    private String ustatus;
}
