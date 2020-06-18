package com.atguigu.shardingjdbc;

import com.atguigu.shardingjdbc.entity.Course;
import com.atguigu.shardingjdbc.entity.User;
import com.atguigu.shardingjdbc.mapper.CourseMapper;
import com.atguigu.shardingjdbc.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UserMapper userMapper;

    //===========水平分表=============================================
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

    //===========水平分库=============================================
    @Test
    void addCourseDb() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("java"+i);
            course.setUserId(((long) i));
            course.setCstatus("Normal"+i);
            courseMapper.insert(course);
        }
    }
    @Test
    void selectCourseDb() {
        Course course = courseMapper.selectOne(new QueryWrapper<Course>().eq("cid",480137797060001793L)
                .eq("user_id",0L));
        System.out.println(course);
    }

    //===========垂直分库=============================================
    @Test
    void addUserDb() {
        User user = new User();
        user.setUsername("aaa");
        user.setUstatus("a");
        userMapper.insert(user);
    }
    @Test
    void selectUserDb() {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("user_id",480485679839576065L));
        System.out.println(user);
    }
}
