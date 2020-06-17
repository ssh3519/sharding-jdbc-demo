package com.atguigu.shardingjdbc.entity;

import lombok.Data;

/**
 * @author: ssh
 * @email: 18367183519@163.com
 * @Date: 2020/6/17 0017 20:52
 */
@Data
public class Course {
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
