package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by maxa on 12/15/2017.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        List<String> fortunes = Arrays.asList("Fortune1", "Fortune2", "Fortune3");
        return fortunes.get(1 + (int)(Math.random() * 3));
    }
}
