import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi, in ra chuỗi đảo ngược
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi:");
        StringBuffer str=new StringBuffer(scanner.nextLine());
        str.reverse();
        System.out.println("chuỗi đảo ngược là:");
        System.out.println(str);
    }
}
