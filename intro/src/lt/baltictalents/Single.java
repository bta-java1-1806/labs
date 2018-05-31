package lt.baltictalents;

public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
