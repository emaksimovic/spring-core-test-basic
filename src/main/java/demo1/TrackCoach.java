package demo1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by maxa on 12/14/2017.
 */
public class TrackCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    TrackCoach() {
    }

    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 30 min";
    }

    @Override
    public String getDailyFortune() {
       return "Just Do it" + fortuneService.getFortune();
    }
}
