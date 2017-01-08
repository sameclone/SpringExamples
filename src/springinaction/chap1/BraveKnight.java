package springinaction.chap1;

import springinaction.chap1.exceptions.QuestException;

/**
 * Created by Monk on 08.01.2017.
 */
public class BraveKnight implements Knight {
    Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkonQuest() throws QuestException {
        quest.embark();
    }
}
