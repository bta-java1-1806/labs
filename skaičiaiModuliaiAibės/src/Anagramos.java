import static lt.baltictalents.labs.util.NotImplementedException.TODO;

public class Anagramos {


  int charMask( char c ) {
    return  0b0000_0000_0000_0000_00001  <<    ( (int)c  -  (int)'A' );
  }

  /**
   * <b>Pavyzdys:</b>
   * <code>
   *   žodžioParašas("") ⇒ 0
   *   žodžioParašas("A") ⇒ 0b0000.....01 = 1
   *   žodžioParašas("M") ⇒ 0b0000.....1_0000_0000_0000 = 1 << 12
   *   žodžioParašas("MAMA") = žodžioParašas("M") | žodžioParašas("A") = (1 << 12) | (1 << 0)
   *
   *   1 << ((int)'M' - (int)'A')
   *
   * </code>
   *
   *
   *
   * @param žodis LATIN1 didžiųjų raidžių rinkinys
   * @return raidžių aibė, užkoduota kaip int, kur 0='A', 1='B', 2='C',...
   */
  public static int žodžioParašas(String žodis) {
    return (int)TODO("suskaičiuoti žodžio raidžių parašą");
  }

  /**
   *
   * @param pirmasŽodis
   * @param žodynas
   * @return
   */
  public static String[] anagramos( String pirmasŽodis, String[] žodynas) {
    return (String[]) TODO("Rasti visas duoto žodžio anagramas žodyne");
  }
}
