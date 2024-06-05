public class TwoPointer {
//    palindrome
    static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

//    two sum
    static String checkTarget(int[] nums){
        int targetResult = 13;
        int left = 0;
        int right =  nums.length - 1;

        while (left < right) {
            int target = nums[left] + nums[right];

            if(target == targetResult ) {

                return "Target is found: " + nums[left] + " + " + nums[right] + " = " + targetResult;
            }

            if( target > targetResult) {
                right --;
            } else {
                left ++;
            }

        }

        return "Target not found";
    }
}