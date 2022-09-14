import java.net.*;

import java.util.Scanner;

public class InetAddressDemo {
    public static void main(String[] args) {
        InetAddress addr1 = null, addr2 = null;
        System.out.print("호스트이름을 입력하시오 : ");
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();

        try {
            addr1 = InetAddress.getByName(url);
            addr2 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {

        }
        System.out.print(url + "의 IP주소: ");
        System.out.println(addr1.getHostAddress());
        System.out.print("로컬 IP주소 :");
        System.out.println(addr2.getHostAddress());

    }

}