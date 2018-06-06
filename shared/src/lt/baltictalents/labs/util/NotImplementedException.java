package lt.baltictalents.labs.util;

/**
 * Klasė, skirta pažymėti nerealizuotam kodui ar įrašyti fiktyvų kodą vietoje jo.
 * Jei reikia tik pažymėti nepabaigtą, bet funkcionalų fragmentą, naudoti anotaciją @TODO.
 * <p>TODO: [@gsm,2018.06.06] sutvarkyti tekstus </p>
 * @deprecated Galutiniame kode ši klasė neturėtų būti naudojama
 *
 * @author gsm
 * @since 1.0
 * @see {@link TODO}
 */
@SuppressWarnings("TodoComment")
@Deprecated
public class NotImplementedException extends UnsupportedOperationException {

  /**
   * @deprecated
   * @param message
   */
  @Deprecated
  public static Object TODO(String message){
    throw new NotImplementedException(message);
  }
  /**
   * @deprecated
   */
  public static Object TODO(){
    throw new NotImplementedException(defaultMessage(2));
  }



  protected static String defaultMessage(int stackLevel) {
    return String.format("Method %s.%s is not (yet) implemented but was called from %s.%s.",
            StacktraceUtils.callerClassName(stackLevel),
            StacktraceUtils.callerMethodName(stackLevel),
            StacktraceUtils.callerClassName(stackLevel+1),
            StacktraceUtils.callerMethodName(stackLevel+1)
    );
  }

  /**
   * Generates an exception with a reference to the caller method.
   *
   * @deprecated Deprecated to remind you to implement the corresponding code
   * before releasing the software.
   */
  @Deprecated
  public NotImplementedException() {
    this( defaultMessage(2) );
  }

  /**
   * @deprecated Deprecated to remind you to implement the corresponding code
   * before releasing the software.
   */
  @Deprecated
  public NotImplementedException(String message) {
    super(message);
  }
}
