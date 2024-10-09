class Solution {
    public void sortColors(int[] nums) {
        int count_0 = 0, count_1 = 0, count_2 = 0;
        for (int n : nums) {
            if (n == 0) 
            {
                count_0++;
            }
            else if (n == 1) {
                count_1++;
            }
            else {
                count_2++;
            }
        }
        for(int i=0;i<count_0;i++){
            nums[i]=0;
        }
        for(int i=count_0;i<count_1+count_0;i++){
            nums[i]=1;
        }
        for(int i=count_0+count_1;i<count_0+count_1+count_2;i++){
            nums[i]=2;
        }
    }
}
