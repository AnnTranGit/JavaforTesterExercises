/*
Mô tả: Viết một chương trình Java tính thuế thu nhập cá nhân dựa trên mức thu nhập hàng năm của
một người. Chương trình sẽ yêu cầu người dùng nhập thu nhập hàng năm và sau đó tính thuế dựa
trên các mức thuế sau:
1.Thu nhập từ 0 đến 5 triệu đồng: 5%
2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
7.Thu nhập trên 80 triệu đồng: 35%
Yêu cầu:
1.Nhập thu nhập hàng năm từ người dùng.
2.Tính số thuế phải trả theo từng mức thuế suất.
3.Xuất số thuế phải trả.
* */

import java.util.Scanner;

public class TaxCalc_Lvl2_Ex1 {

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 5) {
            tax = income * 0.05;
            System.out.println("Bậc 1: " + income + " x 5% = " + tax);
        } else if (income <= 10) {
            tax = 5 * 0.05 + (income - 5) * 0.10;
            System.out.println("Bậc 1: 5 x 5% = " + (5 * 0.05));
            System.out.println("Bậc 2: " + (income - 5) + " x 10% = " + ((income - 5) * 0.10));
        } else if (income <= 18) {
            tax = 5 * 0.05 + 5 * 0.10 + (income - 10) * 0.15;
            System.out.println("Bậc 1: 5 x 5% = " + (5 * 0.05));
            System.out.println("Bậc 2: 5 x 10% = " + (5 * 0.10));
            System.out.println("Bậc 3: " + (income - 10) + " x 15% = " + ((income - 10) * 0.15));
        } else if (income <= 32) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (income - 18) * 0.20;
            System.out.println("Bậc 1: 5 x 5% = " + (5 * 0.05));
            System.out.println("Bậc 2: 5 x 10% = " + (5 * 0.10));
            System.out.println("Bậc 3: 8 x 15% = " + (8 * 0.15));
            System.out.println("Bậc 4: " + (income - 18) + " x 20% = " + ((income - 18) * 0.20));
        } else if (income <= 52) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (income - 32) * 0.25;
            System.out.println("Bậc 1: 5 x 5% = " + (5 * 0.05));
            System.out.println("Bậc 2: 5 x 10% = " + (5 * 0.10));
            System.out.println("Bậc 3: 8 x 15% = " + (8 * 0.15));
            System.out.println("Bậc 4: 14 x 20% = " + (14 * 0.20));
            System.out.println("Bậc 5: " + (income - 32) + " x 25% = " + ((income - 32) * 0.25));
        } else if (income <= 80) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (income - 52) * 0.30;
            System.out.println("Bậc 1: 5 x 5% = " + (5 * 0.05));
            System.out.println("Bậc 2: 5 x 10% = " + (5 * 0.10));
            System.out.println("Bậc 3: 8 x 15% = " + (8 * 0.15));
            System.out.println("Bậc 4: 14 x 20% = " + (14 * 0.20));
            System.out.println("Bậc 5: 20 x 25% = " + (20 * 0.25));
            System.out.println("Bậc 6: " + (income - 52) + " x 30% = " + ((income - 52) * 0.30));
        } else {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (income - 80) * 0.35;
            System.out.println("Bậc 1: 5 x 5% = " + (5 * 0.05));
            System.out.println("Bậc 2: 5 x 10% = " + (5 * 0.10));
            System.out.println("Bậc 3: 8 x 15% = " + (8 * 0.15));
            System.out.println("Bậc 4: 14 x 20% = " + (14 * 0.20));
            System.out.println("Bậc 5: 20 x 25% = " + (20 * 0.25));
            System.out.println("Bậc 6: 28 x 30% = " + (28 * 0.30));
            System.out.println("Bậc 7: " + (income - 80) + " x 35% = " + ((income - 80) * 0.35));
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập thu nhập hàng năm
        System.out.println("Nhập thu nhập hàng năm (triệu đồng): ");
        double income = scanner.nextDouble();

        System.out.println("Số thuế phải trả theo từng mức thuế suất: ");

        double tax = calculateTax(income);
        double roundedTaxAmount = Math.round(tax * 100.0) / 100.0;

        System.out.println("Tổng số thuế phải trả: " + tax + " triệu");
        System.out.println("Tổng số thuế phải trả (làm tròn): " + roundedTaxAmount + " triệu");

        scanner.close();
    }

}
