/*
Tìm Giá Trị Lớn Thứ Hai Trong Mảng
Mô tả: Viết một hàm để tìm giá trị lớn thứ hai trong một mảng số nguyên. Hàm sẽ nhận vào một
mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
Yêu cầu:
Hàm sẽ nhận vào một mảng số nguyên và trả về giá trị lớn thứ hai trong mảng.
Nếu mảng có ít hơn hai phần tử, trả về một giá trị đặc biệt (ví dụ: Integer.MIN_VALUE).
Ví dụ:
Input: [1, 3, 4, 5, 0, 2]
Output: 4
Input: [10, 5, 10]
Output: 5
Input: [3]
Output: Integer.MIN_VALUE*/

public class SecondLargestNum_Lvl1_Ex2 {
   public static int secondLargestNum (int[] arr){

       int max = Integer.MIN_VALUE; // by default  gán giá trị nhỏ nhất cho sô lớn nhất
       int secondMax = Integer.MIN_VALUE; //by default cũng gán giá trị nhỏ nhất cho sô lớn t2

       if (arr.length < 2 ){
           return Integer.MIN_VALUE;
       }

       // gán num
       for (int number : arr)
           if (number > max) { // duyệt từng số trong mảng, nếu number lớn hơn max
               secondMax = max; // số lớn t2 bằng max ban đầu
               max = number; // va cho max = số đó

           } else if (number > secondMax && number < max) { // in case nếu có số trùng với số lớn nhất trong mảng
               secondMax = number;
           }

       return secondMax;


   }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 0, 2};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {3};

        System.out.println(secondLargestNum(arr1));
        System.out.println(secondLargestNum(arr2));
        System.out.println(secondLargestNum(arr3));
     }

}

