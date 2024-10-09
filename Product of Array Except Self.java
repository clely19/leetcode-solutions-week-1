class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int[] left_product = new int[n];
        left_product[0] = 1;
        for(int i=1;i<n;i++){
            left_product[i] = left_product[i-1]*nums[i-1] ;
        }

        int[] right_product = new int[n];
        int rightmost = 1;
        for(int i=n-1;i>=0;i--){
            answer[i] = left_product[i]*rightmost;
            rightmost = rightmost*nums[i];
        }
        return answer;
    }
}
