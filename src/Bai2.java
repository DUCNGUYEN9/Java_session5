import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //Nhập vào 1 chuỗi từ bàn phím, in ra các ký tự chỉ xuất hiện duy nhất 1 lần trong
        //chuỗi. Nếu không có ký tự nào xuất hiện duy nhất 1 lần in ra “Không có ký tự nào
        //xuất kiện 1 lần”
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
        String str = scanner.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        boolean check=false;
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1 && str.charAt(i) != ' ') {
                System.out.printf("ký tự lặp lại 1 lan la: %s\n" , str.charAt(i));
                check=true;
            }
        }
        if(!check){
            System.out.println("Không có ký tự nào xuất kiện 1 lần");
        }

    }
}
