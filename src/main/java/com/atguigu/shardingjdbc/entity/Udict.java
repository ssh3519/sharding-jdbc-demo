package com.atguigu.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: ssh
 * @email: 18367183519@163.com
 * @Date: 2020/6/18 0018 23:00
 */
@Data
@TableName(value = "t_udict")
public class Udict {
    private Long dictid;
    private String ustatus;
    private String uvalue;
}
