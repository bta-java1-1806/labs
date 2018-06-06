package lt.baltictalents.labs.util;

/**
 * Klasė, skirta pažymėti nerealizuotam kodui.
 *
 * @deprecated Galutiniame kode ši klasė neturėtų būti naudojama
 */
@Deprecated
public class NotImplementedException extends UnsupportedOperationException {

  /**
   * Generates an exception with a reference to the caller method.
   *
   * @deprecated Deprecated to remind you to implement the corresponding code
   * before releasing the software.
   */
  @Deprecated
  public NotImplementedException() {
    this(String.format("Method %s.%s is not (yet) implemented but was called from %s.%s.",
            StacktraceUtils.callerClassName(1),
            StacktraceUtils.callerMethodName(1),
            StacktraceUtils.callerClassName(2),
            StacktraceUtils.callerMethodName(2)
    ));
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
