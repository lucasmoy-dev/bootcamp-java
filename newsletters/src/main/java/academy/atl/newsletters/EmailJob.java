package academy.atl.newsletters;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class EmailJob {

    @Scheduled(cron = "0 0 3 ? * MON")
    public void enviarCampanaDeMarketing() {
    }
}
