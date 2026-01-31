
public class _6_exceptions_NullPointer {
    /**
     * Null Pointer Exception Demo.
     * se references
     */

    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        if (s == null) {        // state-test
            System.out.println("s is null");
            return;             //return will pop the current method, the length will not populate
        }
        System.out.println("lll" + s.length());
    }

    public static String getOneOrNull() {
        return null;
    }
}