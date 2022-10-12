import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

//행맨 게임 D:\\Temp\\words.txt 생성후 단어 10개 적고 실행 

public class HangmanTest {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char again = 'n';
        String secret;
        StringBuffer dashes;
        int leftCount;
        boolean done;
        String guess;
        String guesses;
        char letter;
        Words words = new Words("D:\\Temp\\words.txt");

        do {
            secret = words.getRandomWord();
            guesses = "";
            done = false;
            leftCount = 6;

            dashes = makeDashes(secret);

            while (!done) {

                System.out.println("추측할 단어입니다 : " + dashes);
                System.out.println("지금까지 추축한 내용입니다 : " + guesses);
                System.out.println("추축한 문자를 입력하세요 : ");
                guess = in.next();

                if (guess.length() > 1) {
                    if (guess.equals(secret))
                        System.out.println("승리!");
                    else
                        System.out.println("실패");
                    done = true;
                } else {
                    letter = guess.charAt(0);
                    guesses += letter;
                    if (secret.indexOf(letter) < 0) {
                        --leftCount;
                        System.out.println("추축을 잘 못 했습니다 - ");
                    } else
                        matchLetter(secret, dashes, letter);

                    System.out.println(leftCount + "번 더 추측할 수 있습니다.");
                    if (leftCount == 0) {
                        System.out.println("실패");
                        done = true;

                    }
                    if (secret.equals(dashes.toString())) {
                        System.out.println("승리!");
                        done = true;
                    }
                }

            }
            System.out.println("한 판 더 게임 시작... (y/n)?: ");
            again = in.next().charAt(0);

        } while (again == 'Y' || again == 'y');

    }

    public static void matchLetter(String secret, StringBuffer dashes, char letter) {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
                dashes.setCharAt(index, letter);
        System.out.println("놀라워~ 정확한 추측입니다 - ");
    }

    public static StringBuffer makeDashes(String s) {
        StringBuffer dashes = new StringBuffer(s.length());
        for (int count = 0; count < s.length(); count++)
            dashes.append('-');
        return dashes;
    }
}

class Words {
    private String fileName;
    private Random r = new Random();

    public Words(String fileName) {
        this.fileName = fileName;
    }

    public String getRandomWord() {
        String line = null;
        int n = r.nextInt(10);
        try (BufferedReader in = new BufferedReader(new FileReader(fileName));) {
            while (n-- >= 0)
                line = in.readLine();
        } catch (Exception e) {

        }
        return line;
    }
}
