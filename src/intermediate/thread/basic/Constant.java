package intermediate.thread.basic;

public class Constant {

    private static final String PREFIX = "custom";

    public static String getThreadId(String id) {
        return STR."\{PREFIX}-\{id}";
    }
}
