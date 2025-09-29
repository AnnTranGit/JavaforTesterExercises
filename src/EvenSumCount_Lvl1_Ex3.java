/*Tính Tổng Các Số Chẵn
Mô tả: Viết một hàm tính tổng các số chẵn từ 0 đến một số nguyên dương n cho trước.
Yêu cầu:
Hàm nhận vào một số nguyên dương n.
Trả về tổng của tất cả các số chẵn từ 0 đến n.
Ví dụ:
Input: 10
Output: 30
Input: 5
Output: 6
*/

public class EvenSumCount_Lvl1_Ex3 {

    public static int sumCount (int x) {

        int evenSumCount = 0 ;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0){
                evenSumCount += i ;
            }
        }
        return evenSumCount;
    }

    public static void main(String[] args) {
       int res1 = sumCount(10);
        System.out.println(res1);

        int res2 = sumCount(5);
        System.out.println(res2);


    }

}


