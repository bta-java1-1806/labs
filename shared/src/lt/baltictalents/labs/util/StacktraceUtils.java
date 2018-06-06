package lt.baltictalents.labs.util;

/**
 * Pagalbiniai metodai tyrinėti esamam iškvietimų stekui – pvz., klaidų aprašymui arba loginimui.
 * <p>// TODO: [@gsm,2018.06.06] Thread::getStackTrace yra žiauriai lėtas: panaudoti Java9 arba Reflection steko traversavimą </p>
 * <p>// TODO: [@gsm,2018.06.06] pradinė callerMethodName/callerClassName neįsitikina, kad esamas stekas yra pakankamai gilus </p>
 */
public class StacktraceUtils {
  /**
   * Metodo, iškvietusio šį metodą, pavadinimas.
   * @param stackDepth kiek papildomai praleisti steko lygių
   * @return metodo pavadinimas
   * @throws ArrayIndexOutOfBoundsException jei stekas nepakankamai gilus, kad egzistuotų ieškomas elementas
   */
  public static String callerMethodName(int stackDepth) {
    StackTraceElement[] stack = Thread.currentThread().getStackTrace();
    // TODO: [@gsm,2018.06.06] check stack depth
    return stack[stackDepth+2].getMethodName();
  }

  /**
   * Klasės, iškvietusios šį metodą, pavadinimas.
   * @param stackDepth kiek papildomai praleisti steko lygių
   * @return metodo pavadinimas
   * @throws ArrayIndexOutOfBoundsException jei stekas nepakankamai gilus, kad egzistuotų ieškomas elementas
   */
  public static String callerClassName(int stackDepth) {
    // TODO: [@gsm,2018.06.06] check stack depth
    return Thread.currentThread().getStackTrace()[stackDepth+2].getClassName();
  }
}
