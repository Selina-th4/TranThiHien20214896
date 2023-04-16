package thuchanh1;
import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số thực từ bàn phím
        System.out.print("Nhập số thực thứ nhất: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);

        System.out.print("Nhập số thực thứ hai: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        // Tính tổng, hiệu, tích và thương của hai số
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient;

        if (num2 == 0) {
            System.out.println("Không thể chia cho 0.");
            return;
        } else {
            quotient = num1 / num2;
        }

        // In kết quả ra màn hình
        System.out.println("Tổng của hai số là: " + sum);
        System.out.println("Hiệu của hai số là: " + difference);
        System.out.println("Tích của hai số là: " + product);
        System.out.println("Thương của hai số là: " + quotient);
    }
}

