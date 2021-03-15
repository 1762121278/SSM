package com.bonc.ssm;

import com.bonc.ssm.controller.StudentController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/ApplicationContext.xml","classpath:spring/SpringMvc.xml"})
public class TestStu {

    @Autowired
    private StudentController studentController;

    @Test
    public void testA(){
        System.out.println(studentController.selectAll());
    }
}
