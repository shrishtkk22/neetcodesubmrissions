class Solution {
    public int maxArea(int[] heights) {


        int start =0;
        int end = heights.length-1;

        int maxArea= 0;
        

        while(start<end){

            int length = Math.min(heights[start],heights[end]);
           int  breadth = end-start;

           int  area = length*breadth;

           maxArea = Math.max(maxArea,area);

           if(heights[start]<=heights[end]){

            start++;


           }else if(heights[start]>heights[end]){

            end--;


           }


        }

        return maxArea;





        
    }
}
        
    

