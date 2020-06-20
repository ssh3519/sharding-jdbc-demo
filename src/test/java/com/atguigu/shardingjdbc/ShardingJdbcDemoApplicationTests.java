package com.atguigu.shardingjdbc;

import com.atguigu.shardingjdbc.entity.Course;
import com.atguigu.shardingjdbc.entity.Udict;
import com.atguigu.shardingjdbc.entity.User;
import com.atguigu.shardingjdbc.mapper.CourseMapper;
import com.atguigu.shardingjdbc.mapper.UdictMapper;
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

    @Autowired
    private UdictMapper udictMapper;
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
        user.setUsername("bbb");
        user.setUstatus("b");
        userMapper.insert(user);
    }
    @Test
    void selectUserDb() {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("user_id",480485679839576065L));
        System.out.println(user);
    }

    //===========公共表=============================================
    @Test
    void addDict() {
        Udict udict = new Udict();
        udict.setUstatus("a");
        udict.setUvalue("已启用");
        udictMapper.insert(udict);
    }
    @Test
    void deleteDict() {
        udictMapper.delete(new QueryWrapper<Udict>().eq("dictid",480512693833302017L));

    }
}
