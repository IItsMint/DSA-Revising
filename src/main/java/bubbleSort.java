public class bubbleSort {

    //Bubble sort is an algorithm that sorts an array from the lowest to highest value.

    //Go through the array, one value at a time,
    //for each value compare the value with the next value,
    //if the value the value is higher than the next one, swap the values, so that highest value goes to end,
    //Go through the array as may times as there are values in the array.
    //even if the array is sorted before validating every single index, program does not know that,
    // so it has to validate every single indexes one by one.


    //time complexity of this algo is o(n^2) since we are using nested loops.

    public static void main(String[] args) {
        int temp=0;
        int nums[] = {2,9,3,7,1,0,4,6,8,5};

        //while the outer loop handles the iteration number,
        //inner loop handles swapping and comparing operations.
        for(int x = 0; x < nums.length; x++){
            for(int y = 0; y < nums.length - 1; y++){
                if(nums[y]>nums[y+1]){
                    temp=nums[y];
                    nums[y]=nums[y+1];
                    nums[y+1]=temp;
                }
            }
        }
        //we need this to see numbers.
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
