package Test;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {
    public static void main(String[] args) {

        String s = "of the people, by the people, forthe people";
        try {
            showTokens(s, ", ");
        } catch (NoSuchElementException e) {
            System.out.println("끝");
        }
    }

    public static void showTokens(String s, String delim) throws NoSuchElementException {
        String token;
        StringTokenizer st = new StringTokenizer(s, ",");
        while (true) {
            token = st.nextToken();
            System.out.println(token);
        }
    }
}
