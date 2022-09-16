import java.util.Scanner;

public class Test02_graed {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("등수를 입력하세요  :");
        int gra = in.nextInt();

        String kind = switch (gra) {
            case 1 -> "아주잘했습니다.";
            case 2, 3 -> "잘했습니다.";
            case 4, 5, 6 -> "보통입니다.";
            default -> {
                System.out.print("노력해야겠습니다.");
                yield "";
            }

        };
        System.out.printf("%s\n", kind);
    }

}
