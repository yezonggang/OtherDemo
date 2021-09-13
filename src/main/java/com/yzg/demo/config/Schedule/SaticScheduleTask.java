package com.yzg.demo.config.Schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration
// 定时任务
@EnableScheduling
public class SaticScheduleTask {
    private final Logger logger= LoggerFactory.getLogger(SaticScheduleTask.class);
    // 秒分时日月周
    @Scheduled(cron = "0/7 * * * * ?")
    private void configureTasks() {
        logger.info("定时任务每7秒打印: " + LocalDateTime.now());
    }
}