package com.roy;

import com.roy.entity.Course;
import com.roy.mapper.CoureMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author : adward
 * @date : 2023-03-29 23:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingTest {

    @Resource
    private CoureMapper coureMapper;

    @Test
    public void addCourse(){
        Course course = new Course();
        course.setCid(1L);
        course.setCname("java");
        course.setUserid(100L);
        course.setCstatus("1");
        coureMapper.insert(course);
    }
}
