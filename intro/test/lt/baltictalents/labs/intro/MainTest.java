package lt.baltictalents.labs.intro;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;  // assertThat sąlygos is(), isInstance(), ir t.t.
import static org.junit.Assert.*;           // assertEquals, assertThat, ir t.t.

@SuppressWarnings("MagicNumber") // Java pyksta dėl beprasmių skaičių: nuraminam, kad testavimo klasėj nekreiptų dėmesio
public class MainTest {

    @Test
    public void sum_1_to_5() {
        assertThat(Main.sum(1, 2, 3, 4, 5), is(15));
    }

    @Test // ne iš eilės
    public void sum_10_to_50() {
        assertThat(Main.sum(10, 20, 30, 40, 50), is(150));
    }

    @Test // lyginis skaičius elm.
    public void sum_0_to_5() {
        assertThat(Main.sum(0, 1, 2, 3, 4, 5), is(15));
    }

    @Test // neigiami pakaitom su teigiamais
    public void sum_plus_minus() {
        assertThat(Main.sum(1 - 2, 3, -4, 5), is(3));
    }

    @Test // nėra argumentų
    public void sum_no_args() {
        assertThat(Main.sum(), is(0));
    }

    @Test // tuščias masyvas
    public void sum_no_elms() {
        //  noinspection RedundantArrayCreation       // iš tikrųjų, tai tik patikrinam sintaksę
        assertThat(Main.sum(new int[0]), is(0));
    }

    @Test // Overflow
    public void sum_ovrflw() {
        assertThat(Main.sum(
                3,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                -Integer.MAX_VALUE,
                -Integer.MAX_VALUE,
                -Integer.MAX_VALUE,
                -5
        ), is(-2));

    }

    @Test // Underflow
    public void sum_undrflw() {
        //noinspection NumericOverflow              // išjungia IDEA įspėjimą dėl Numeric Overflow -Integer.MIN_VALUE
        assertThat(Main.sum(
                -5,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                -Integer.MIN_VALUE,
                -Integer.MIN_VALUE,
                -Integer.MIN_VALUE,
                3
        ), is(-2));
    }


    @Test // Twist over both edges Pacman-style
    public void sum_twist() {
        assertThat(Main.sum(
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,

                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,

                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE,

                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE
        ), is(-8));
    }

    @Test // masyvas yra null ⇒ NullPointerException
    public void sum_null_arr() {
        try {
            // 1. IDEA apskaičiavo, kad sum() lūžta nuo null – nuraminam
            // 2. mums ir nerūpi rezultatas, tik nulaužti

            //noinspection ConstantConditions,ResultOfMethodCallIgnored
            Main.sum((int[]) null);

            fail("Did not throw with null array");

        }catch (Throwable e) {
            // e.printStackTrace();
            assertThat("Not a NullPointerException!!!", e.getClass(), sameInstance(NullPointerException.class));
        }
    }

    @Test // ar pradinis masyvas nesugadinamas
    public void sum_modif() {
        final int[] orig = {5,4,3,2,1};
        final int[] copy = orig.clone();         // kopijuojam masyvo turinį baitas į baitą

        //noinspection ResultOfMethodCallIgnored // OK – mums ir nerūpi rezultatas, tik žiūrim, ar nesusigadina masyvas
        Main.sum(orig);
        assertThat(copy, is(orig));
    }

    @Test
    public void average() {
        assertThat(Main.average(-2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE), is(-1));
    }

}
