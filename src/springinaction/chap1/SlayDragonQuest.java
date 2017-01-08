package springinaction.chap1;

import springinaction.chap1.exceptions.QuestException;

/**
 * Created by Monk on 08.01.2017.
 */
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() throws QuestException {
        System.out.println("Slay Dragon Quest!!");
    }
}
