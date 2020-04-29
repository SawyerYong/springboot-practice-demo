package com.sawyer.demo.asyscdemo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @ClassName TaskOne
 * @Author Sawyer Yong
 * @Date 2020-04-29 15:00
 * @Description 任务
 */
@Component
public class TaskOne {

    @Async
    public void taskOne(String name){
        System.out.println("执行了第一个任务,name="+name);
    }

    @Async
    public void taskTwo(String name){
        System.out.println("执行了第二个任务,name="+name);
    }
}
