class Solution {
    public int findNumbers(int[] nums) {
        int c1=0;
        for(int i=0;i<nums.length;i++){
            int digit=nums[i];
            int c= countdigit(digit);
            if(c%2==0){
                c1++;
            }
        }
        return c1;
    }
    static int countdigit(int digit){
        int count =0;
        int n=digit;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}