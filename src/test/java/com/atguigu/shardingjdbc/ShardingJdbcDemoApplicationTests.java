package com.atguigu.shardingjdbc;

import com.atguigu.shardingjdbc.entity.Course;
import com.atguigu.shardingjdbc.mapper.CourseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    //添加
    @Test
    void addCourse() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("java"+i);
            course.setUserId(100L);
            course.setCstatus("Normal"+i);
            courseMapper.insert(course);
        }
    }

    //查询
    @Test
    void selectCourse() {
        Course course = courseMapper.selectOne(new QueryWrapper<Course>().eq("cid",480124807594115073L));
        System.out.println(course);
    }
}
