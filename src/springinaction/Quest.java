package springinaction;

import springinaction.exceptions.QuestException;

/**
 * Created by Monk on 08.01.2017.
 */
public interface Quest {
    void embark() throws QuestException;
}
