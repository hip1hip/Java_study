class Icon {
    interface Touchable {
        void touch();
    }
}

public class InnerInterfaceDemo implements Icon.Touchable {
    public void touch() {
        System.out.println("아이콘을 터치한다.");
    }

    public static void main(String[] args) {
        Icon.Touchable btn = new InnerInterfaceDemo();
        btn.touch();
    }

}
