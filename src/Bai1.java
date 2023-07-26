import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Nhập vào 2 chuỗi từ bàn phím, kiểm tra 2 chuỗi có phải là đảo ngược nhau hay
        //không. Nếu có thì in ra “YES” ngược lại “NO”.
        //Ví dụ: “word” và “drow” là 2 chuỗi đảo ngược nhau
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.println("nhập vào chuỗi 2: ");
        String str2 = scanner.nextLine();
        System.out.println("kiểm tra 2 chuỗi có phải là đảo ngược nhau:");
        boolean check = true;
        for (int i = 0, j = str2.length() - 1; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                check = false;
                break;
            }
            j--;
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
