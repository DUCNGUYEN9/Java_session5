import java.util.Scanner;


public class Bai5 {
    public static void main(String[] args) {
        //Nhập vào một chuỗi, chuẩn hóa chuỗi theo quy tắc:
        //a. Không có khoảng trắng ở 2 đầu
        //b. Mỗi từ cách nhau 1 khoảng trắng
        //c. Ký tự đầu tiên của mỗi từ được viết hoa, các ký tự khác viết thường
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        System.out.println("xóa khoảng trắng ở 2 đầu");
        System.out.println(str.trim());
        System.out.println("xóa khoảng trắng ở giữa");
        System.out.println(str.replaceAll("\\s\\s+"," "));
        System.out.println("Ký tự đầu tiên của mỗi từ được viết hoa");
        char[] charArray= str.toCharArray();
        boolean foundSpace=true;//tim khoảng trắng
        for (int i = 0; i < charArray.length; i++) {
            //kiểm tra có phải ký tự
            if(Character.isLetter(charArray[i])){
                if(foundSpace){
                    charArray[i]=Character.toUpperCase(charArray[i]);
                    foundSpace=false;
                }else {
                    charArray[i]=Character.toLowerCase(charArray[i]);
                }
            }else {
                foundSpace=true;
            }
        }
        System.out.println(charArray);

    }
}
