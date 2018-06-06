package lt.baltictalents.labs.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*; // @Retention(RetentionPolicy.RUNTIME)
import static java.lang.annotation.ElementType.*;     // @Target({ElementType.METHOD,....})

/**
 * Pažymi neužbaigtą klasę, metodą ar priskyrimą metaduomenų lygmeniu (funkcionalumo nekeičia).
 * Kartu su {@link NotImplementedException} realizuoja save-dokumentuojantį užduoties kodą.
 *
 * @deprecated Šios anotacijos galutiniame produkte neturi likti.
 *
 * @see NotImplementedException jei reikia generuoti klaidą vykdymo metu ar pažymėti nerealizuotą bloką.
 * @see NotImplementedException#TODO()
 *
 * @author gsm
 * @since 1.0
 */
@SuppressWarnings("TodoComment")
@Deprecated
@Retention(RUNTIME)
@Target({ ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE, TYPE_PARAMETER})
public @interface TODO {
  /**
   * @return Trūkumo aprašas.
   */
  String value() default "";

}
