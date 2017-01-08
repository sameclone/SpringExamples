package springinaction.chap2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import springinaction.chap2.exceptions.PerformanceException;

/**
 * Created by Monk on 08.01.2017.
 */
public class JugglerTester {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new FileSystemXmlApplicationContext("chap2.xml");

        Stage stage = (Stage)context.getBean("theStage");

        Performer performer = (Performer) context.getBean("duke");
        performer.perform();

        Performer performer2 = (Performer) context.getBean("duke2");
        performer2.perform();
    }
}
