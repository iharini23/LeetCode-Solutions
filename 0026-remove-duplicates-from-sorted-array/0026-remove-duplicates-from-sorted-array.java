class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new TreeSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            s.add(nums[i]);
        }
        int i=0;
        for(int x:s){
            nums[i]=x;
            i++;
        }
        return s.size();
    }
}