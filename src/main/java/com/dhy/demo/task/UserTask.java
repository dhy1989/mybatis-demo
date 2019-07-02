package com.dhy.demo.task;

import com.dhy.demo.entity.User;
import com.dhy.demo.service.UserService;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author dinghy
 * @date 2019/7/2 11:18
 */
@Component
public class UserTask {

    private static final String FOURTEEN_MIN = "PT14M";
    @Autowired
    private UserService userService;

    @Scheduled(initialDelay = 1000 * 30, fixedDelay = 1000 * 3)
    @SchedulerLock(name = "scheduledTaskName", lockAtMostForString = FOURTEEN_MIN, lockAtLeastForString = FOURTEEN_MIN)
    public void scheduledTask() throws InterruptedException {
        // do something
        System.out.println("任务开始:"+System.currentTimeMillis());
        Thread.sleep(20000);
        List<User> users = userService.selectAll();
        for (User user : users) {
            if(user.getAge()==10){
                user.setAge(100);
            }
            userService.updateByPrimaryKey(user);
            Thread.sleep(10000);
            System.out.println(user.getName()+"--------"+user.getAge());
        }
        System.out.println("任务结束"+System.currentTimeMillis());

    }
}
