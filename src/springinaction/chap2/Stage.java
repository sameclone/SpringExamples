package springinaction.chap2;

/**
 * Created by Monk on 08.01.2017.
 */
public class Stage {
    private Stage(){
        System.out.println("Creating the Stage....");
    }

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return  StageSingletonHolder.instance;
    }
}
