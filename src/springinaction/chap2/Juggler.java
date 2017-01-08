package springinaction.chap2;

import springinaction.chap2.exceptions.PerformanceException;

/**
 * Created by Monk on 08.01.2017.
 */
public class Juggler implements Performer {
    private int beanbags =3;

    public Juggler(int beanbags) {
        this.beanbags = beanbags;
    }

    public Juggler() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING  "+beanbags+" BEANBAGS!!!");

    }
}
