package springinaction.chap2;

import java.util.Arrays;

/**
 * Created by Monk on 08.01.2017.
 */
public class Sonnet29 implements Poem {
    private static String[] LINES = {"When, in disgrace with fortune and men’s eyes,\n",
            "I all alone beweep my outcast state,\n",
            "And trouble deaf heaven with my bootless cries,\n",
            "And look upon myself and curse my fate,\n",
            "Wishing me like to one more rich in hope,\n",
            "Featured like him, like him with friends possessed,\n",
            "Desiring this man’s art and that man’s scope,\n",
            "With what I most enjoy contented least;\n",
            "Yet in these thoughts myself almost despising,\n",
            "Haply I think on thee, and then my state,\n",
            "(Like to the lark at break of day arising\n",
            "From sullen earth) sings hymns at heaven’s gate;\n",
            "       For thy sweet love remembered such wealth brings\n",
            "       That then I scorn to change my state with kings."};


    public Sonnet29() {
    }

    @Override
    public void recite() {
        Arrays.stream(LINES).forEach(System.out::print);

    }
}
