class Solution {
    public int findNthDigit(int n) {
        int dig=1;
        int intervaldig=9;
        while(n-intervaldig>0){
            n=n-intervaldig;
            dig=dig+1;
            intervaldig=9*((int)Math.pow(10, dig-1)*dig);
            if(intervaldig<0) break;
        }
        int base=((int)Math.pow(10, dig-1));
        int num=base+(n-1)/dig;
        char res=String.valueOf(num).charAt((n-1)%dig);
        return res-'0';

    }
}