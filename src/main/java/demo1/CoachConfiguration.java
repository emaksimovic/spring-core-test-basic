package demo1;

import org.springframework.context.annotation.Bean;

/**
 * Created by maxa on 12/14/2017.
 */
public class CoachConfiguration {

    @Bean
    FortuneService fortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    Coach theCoach() {
        return new BaseballCoach();
    }
}
