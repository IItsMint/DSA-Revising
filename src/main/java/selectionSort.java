public class selectionSort {

   public static void main(String[] args) {

       //The selection sort algorithm finds the either lowest or highest value in the array
       //and moves it to either front or end of the array.

       //Go through the array to find lowest/highest value,
       //Move the lowest/highest value to front/end of the unsorted part of the array,
       //Go through the array as many times as there are values in the array.

       //Again we are going through all the variables in the array like bubble sort,
       // however, we are doing swapping once per iteration.

       //time complexity of this algo is o(n^2) since we are using nested loops.

       int temp = 0;
       int minIndex;
       int nums [] = {3,6,9,1,7,4,8,2,0,5};

       // Outer loop going through each position in the array
       for(int x = 0; x<nums.length-1; x++){
           minIndex = x; // Assume the current position is the smallest
           // Inner loop is checking for smaller values in the rest of the array
           for(int y = x+1; y < nums.length; y++){
               if(nums[minIndex] > nums[y]){
                   minIndex = y;
               }
           }
           // Swap the smallest value with the current value.
           temp = nums[minIndex];
           nums[minIndex]=nums[x];
           nums[x]=temp;
       }
       // Print the sorted array
       for(int num:nums){
           System.out.print(num+" ");
       }

    }
}
