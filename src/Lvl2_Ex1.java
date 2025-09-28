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

public class Lvl2_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thu nhập hàng năm từ người dùng");
        int income = sc.nextInt();

        double taxRate;

        // 2. Xác định thuế suất theo mức thu nhập
        if (income <= 5) {
            taxRate = 0.05;
        } else if (income <= 10) {
            taxRate = 0.10;
        } else if (income <= 18) {
            taxRate = 0.15;
        } else if (income <= 32) {
            taxRate = 0.20;
        } else if (income <= 52) {
            taxRate = 0.25;
        } else if (income <= 80) {
            taxRate = 0.30;
        } else {
            taxRate = 0.35;
        }

        //tinh thue
        double taxAmount = income * taxRate;

        System.out.println("Thu nhập: " + income + " triệu");
        System.out.println("% Thuế: " + (taxRate * 100) + "%");
        System.out.println("Số thuế phải trả: " + taxAmount + " triệu đồng");


    }
}
