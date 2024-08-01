package yh_project.pageeventcollector.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Job {

    @Scheduled(cron = "0 * * * * *")//테스트용, 매분 요청
    public void dataServingFromMongoToMysql() {
        System.out.println(" schedule process running! ");
    }
}
