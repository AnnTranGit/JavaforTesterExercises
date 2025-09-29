/*
* Two Sum II - Input Array Is Sorted
Mô tả: Cho một mảng đã được sắp xếp tăng dần và một số nguyên target, hãy tìm hai số trong
mảng có tổng bằng target và trả về chỉ số (index) của chúng (bắt đầu từ 1).
Ví dụ:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
* */

import java.util.Arrays;

public class TwoSum_Lvl3_Ex1 {
    public static int[] twoSum(int[] numArray, int target ) {

        int left = 0 ; //1st index
        int right = numArray.length - 1; //last index

        while (left < right){
            int sum = numArray[left] + numArray[right]; //tong sum = giá trị của index right + left

            if (sum == target){
                return new int[]{left + 1 , right + 1}; // do bắt trả về chỉ số (index) của chúng (bắt đầu từ 1).
            } else if (sum < target) {
                left++;
            } else { //case sum > target
                right--;
            }

        }

        return new int[]{0};

    }

    public static void main(String[] args) {
       int[] numArr ={2,7,11,15} ;
       int target = 9;
       int[] res = twoSum(numArr,target);
        System.out.println(Arrays.toString(res));

        int[] numArr1 ={2,7,11,15} ;
        int target1 = 26;
        int[] res1 = twoSum(numArr1,target1);
        System.out.println(Arrays.toString(res1));

    }


}
