package com.sawyer.demo.asyscdemo;

import com.sawyer.demo.asyscdemo.servic.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsyscDemoApplicationTests {
    @Autowired
    private TaskService taskService;

    @Test
    public void test01(){
        taskService.testTask();
    }


}
