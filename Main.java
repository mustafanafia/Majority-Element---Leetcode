import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3,2,3,2,2};
        Main o = new Main();
        System.out.println(o.majorityElement(arr));
    }
    public int majorityElement(int[] nums) {

        int votes = 1;
        int majority = nums[0];

        for(int i=1; i<nums.length; i++){
            if(votes == 0){
                majority = nums[i];
                votes++;
            }
            else if(majority == nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }

        return majority;
    }

}

// *** Another Solutions ***

//    public int majorityElement(int[] nums) {
//
//        Arrays.sort(nums);
//        int[] count = new int[nums.length+1];
//        int max_count = count[0];
//        int max = 0;
//
//
//        for (int temp : nums) {
//            count[temp]++;
//        }
//
//        for (int i=1; i < count.length; i++) {
//            System.out.println(i + " Occurs " + count[i] + " Times " );
//            if (count[i] > max_count) {
//                max_count = count[i];
//                max = i;
//            }
//        }
//        //System.out.println(max_count);
//        System.out.println("Largest occurance value " + max);
//
//
//        return 0;
//    }
//}