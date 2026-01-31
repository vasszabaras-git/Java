package gr.aueb.cf.cf9.ch7;

/**
 * Formatting primitives to Strings. B1
 */
public class _14_strings_StringFormat {

    public static void main(String[] args) {
        char row = 'B';
        int col = 1;

        String seat = String.format("%c%02d", row, col);
        System.out.println(seat);
    }
}

