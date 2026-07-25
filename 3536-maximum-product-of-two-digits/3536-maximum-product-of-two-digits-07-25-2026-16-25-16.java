class Solution {
    public int maxProduct(int n) {
        int m1 = 0, m2 = 0;

        while(n>0){
            int mod = n%10;
            if(mod > m1){
                m2 = m1;
                m1 = mod;
            }
            else if(mod > m2){
                m2 = mod;
            }
            n/=10;
        }
        return m1 * m2;
    }
}