import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        //Nhập vào 2 chuỗi, nối 2 chuỗi với nhau, nếu 2 chuỗi có độ dài không bằng nhau
        //thì tiến hành cắt bỏ các ký tự đầu của chuỗi dài hơn đến khi chúng bằng nhau thì
        //tiến hành nối lại. (Sử dụng phương thức subString(start,length) của lớp String)
        //Ví dụ: “Wellcome” và “home” → nối lại thành “comehome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1");
        String str1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi 2");
        String str2 = scanner.nextLine();
        System.out.println("chuỗi đã được nối: ");
        if(str1.length()>str2.length()){
            System.out.println(str1.substring(str1.length()-str2.length())+str2);
        }else {
            System.out.println(str2.substring(str2.length()-str1.length())+str1);
        }
    }
}
