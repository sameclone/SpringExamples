package springinaction.chap2;

import springinaction.chap2.exceptions.PerformanceException;

/**
 * Created by Monk on 08.01.2017.
 */
public interface Performer {
     void perform() throws PerformanceException;
}
