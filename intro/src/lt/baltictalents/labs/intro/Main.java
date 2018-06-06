package lt.baltictalents.labs.intro;


import lt.baltictalents.labs.util.TODO;

import static lt.baltictalents.labs.util.NotImplementedException.TODO;

public class Main {
  public static void main(String... args) {
    System.out.println("hi");
  }

  /**
   * Apskaičiuoja visų išvardytų sveikųjų skaičių sumą.
   * Jei suma viršija {@code Integer.MAX_VALUE}, arba yra neigiamas skaičius, moduliu didesnis
   * už {@code -Integer.MAX_VALUE - 1}, įvyksta „tylus“ perpildymas.
   *
   * <p> N.B. jei perpildymas įvyksta <b>dalinėje</b> sumoje, bet <b>visa</b> suma yra intervale
   * {@code [Integer.MIN_VALUE .. Integer.MAX_VALUE]}, perpildymas neįvyksta.
   *
   * <p>TODO [@gsm,2018.06.01] aprašyti perpildymo taisykles!
   *
   * @param xArray sveikųjų skaičių sąrašas arba masyvas
   * @return argumentų arba masyvo narių suma
   * @throws NullPointerException jei vietoj skaičių VarArgs'ų paduodamas {@code null}
   * @see Integer#MIN_VALUE
   * @see Integer#MAX_VALUE
   */
  public static int sum(int... xArray) {

    // if(xArray==null) throw new NullPointerException();     // Tas gausis savaime ciklo viduje, taip įdomiau 😀

    int result = xArray[0]; // TODO: Užduotis: pataisyti klaidą

    // nors sutaupytume simbolių, bet čia TIKRAI nenorime iteruoti per masyvą kaip per kolekciją „for(int e:xArray)“
    //noinspection ForLoopReplaceableByForEach
    for (int i=1, n=xArray.length; i < n; i++) {
      result += xArray[i];
    }

    return result;
  }



  @TODO("Realizuoti metodą average")
  public static int average(int ...xArray) {
    //throw new lt.baltictalents.labs.util.NotImplementedException();  // Užduotis: užpildyti šį metodą
    return (int)TODO("Nerealizuotas metodas Main.average.");
  }

}
