package demo1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by maxa on 12/16/2017.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String email;

    CricketCoach() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "fast balling 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
