import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int num = sc.nextInt();
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            int i = 2;
            while (i < Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        if (check == true) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong la so nguyen to");
        }
    }
}
