package com.sawyer.demo.asyscdemo.servic;

import com.sawyer.demo.asyscdemo.task.TaskOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TaskService
 * @Author Sawyer Yong
 * @Date 2020-04-29 15:02
 * @Description 说点什么吧~
 */
@Service
public class TaskService {

    @Autowired
    private TaskOne taskOne;

    public void testTask(){
        System.out.println("任务开始");

        taskOne.taskOne("hello");
        taskOne.taskTwo("张三");

        System.out.println("任务结束");
    }
}
