package lt.baltictalents.intro.util;

public class SystemUtils {
    private static SystemUtils ourInstance = new SystemUtils();

    public static SystemUtils getInstance() {
        return ourInstance;
    }

    private SystemUtils() {
    }
}
