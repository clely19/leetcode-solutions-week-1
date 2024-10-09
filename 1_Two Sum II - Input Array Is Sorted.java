class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        int[] indices = new int[2];
        for(int i =0;i<numbers.length;i++){
            int diff = target - numbers[i];
            if(map.containsKey(diff)){
                indices[0] = map.get(diff)+1;
                indices[1] = i+1;
                return indices;
            }
            map.put(numbers[i],i);
        }
        return indices;

      
    }
}

