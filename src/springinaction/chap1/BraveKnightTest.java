package springinaction.chap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import springinaction.chap1.exceptions.QuestException;

/**
 * Created by Monk on 08.01.2017.
 */
public class BraveKnightTest {
    public static void main(String[] args) throws QuestException {
        ApplicationContext context = new FileSystemXmlApplicationContext("knights.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkonQuest();
    }
}
