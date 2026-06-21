class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;

        while(left < right){
          int area=(right-left)*Math.min(height[left],height[right]);
          maxarea=Math.max(area,maxarea);
          if(height[left]<height[right]){
            left++;
          }
          else if(height[left]>height[right]){
            right--;
          }else{
            left++;
            right--;
          }
          
        }
        
        return maxarea;
    }
}
