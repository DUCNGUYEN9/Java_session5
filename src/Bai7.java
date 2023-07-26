import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi, xóa các ký tự xuất hiện nhiều hơn 1 lần trong chuỗi và chỉ giữ
        //lại ký tự đầu tiên.
        //Ví dụ: “Rikkei” thành “Rike”
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        StringBuilder str_new = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] > 0) {
                str_new.append(ch);
                count[ch] = 0; // Đánh dấu là đã xử lý ký tự này
            }
        }
        System.out.println("Chuỗi mới: " + str_new.toString());
    }
}
