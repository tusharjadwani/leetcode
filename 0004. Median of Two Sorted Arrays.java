class Solution {
    
    int x=0,y=0;int no=0;

    private int getNextMin(int[] a, int[] b){
            if(x==a.length){
               return b[y++];
            }
            else if(y==b.length){
                return a[x++];
            }
            else if(a[x]<=b[y]) {
                return a[x++];
            }
            else{
               return b[y++];
            }
    }

    public double findMedianSortedArrays(int[] a, int[] b) {
        int len = a.length+b.length; 
        if(len % 2 != 0){
            for(int i=0;i<len/2;i++) {
                getNextMin(a,b);
            }
            return getNextMin(a,b);  
        }
        else{
            for(int i=0;i<len/2-1;i++) {
                getNextMin(a,b);
            }
            return ((double) getNextMin(a,b) + getNextMin(a,b))/2;
        }

    }
}
