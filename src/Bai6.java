import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi, thay thế các chuỗi “Academy” thành “Học viện”. (Sử dụng
        //phương thức replace trong String)
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str=scanner.nextLine();
        System.out.println("thay thế thành: ");
        System.out.println(str.replaceAll("Academy","Học viện"));
    }
}
