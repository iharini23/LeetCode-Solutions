class Solution {
    public boolean binarySearch(int row, int r, int target, int[][] matrix) {
        int l=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(matrix[row][mid]==target)
            return true;
            else if(matrix[row][mid]<target)
            l=mid+1;
            else
            r=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target){
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0; i<m; i++){
            if(matrix[i][n-1]>=target)
                return binarySearch(i, n-1, target, matrix);
        }
        return false;
    }
}