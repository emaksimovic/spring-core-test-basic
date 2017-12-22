package demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by maxa on 12/14/2017.
 */
@Component("thatSillyCoach")
public class BaseballCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    BaseballCoach() {
    }

    BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 min in a batting cage";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
