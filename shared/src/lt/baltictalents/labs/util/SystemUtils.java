package lt.baltictalents.labs.util;


import java.io.InputStream;
import java.io.PrintStream;

/**
 * <h1>Statiniai pagalbiniai metodai darbui su System klase.</h1>
 * <ul>
 *   <li>{@link System#out}, {@link System#err} ir {@link System#out} perėmimas</li>
 * </ul>
 */
public final class SystemUtils {

  private InputStream origSystemIn = null;
  private PrintStream origSystemOut = null;
  private PrintStream origSystemErr = null;

  public static void captureSystemOut() {
    captureSystemOut(true);
  }

  public static void captureSystemOut(final boolean transparent) {
    // TODO: [@gsm,2018.06.06]
    throw new NotImplementedException();
  }
}
