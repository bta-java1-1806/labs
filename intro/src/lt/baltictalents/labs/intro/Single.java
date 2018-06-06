package lt.baltictalents.labs.intro;

public class Single {
    private static final Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
