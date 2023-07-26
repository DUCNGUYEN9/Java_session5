import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi, kiểm tra trong chuỗi có ký tự số không, nếu có in ra “YES”
        //ngược lại in ra “NO”. Làm bằng 2 cách (Sử dụng Regex và phương thức isDigit
        //của lớp Character)
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        //cach 1:phương thức isDigit của lớp Character
        System.out.println("cach 1: phương thức isDigit của lớp Character:");
        boolean check = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Trong chuỗi có ký tự số");
        } else {
            System.out.println("Trong chuỗi không có ký tự số");


        }
        //cach 2: regex
        System.out.println("cach 2: regex: ");
        String number_regex=".*[0-9].*";
        if(Pattern.matches(number_regex,str)){
            System.out.println("Trong chuỗi có ký tự số");
        }else {
            System.out.println("Trong chuỗi không có ký tự số");
        }
    }
}
