// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n=numbers.length;
//         ArrayList<Integer> res=new ArrayList<>();

//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 if(numbers[i]+numbers[j]==target){
//                     res.add(i+1);
//                     res.add(j+1);
//                 }
//             }
//         }
//         int[] arr = res.stream()
//                 .mapToInt(Integer::intValue)
//                 .toArray();
//         return arr;
//     }
// }
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target) return new int[]{left + 1, right + 1};
            else if(sum>target) right--;
            else left++;
        }
        return new int[]{left + 1, right + 1};
    }
}