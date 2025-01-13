public class insertionSort {

    //The insertion sort algorithm uses one part of the array to hold values,
    //and the other part of the array to hold values that are not sorted yet.

    //Take the first value from the unsorted part of the array (assuming index 0 is sorted),
    //Move the value into correct place in the sorted part of the array,
    //Go through the unsorted part of the array again as many times as there are values.

    //in this algorithm, if we have 5 elements, sorting algorithm will run must 4 times,
    //since we don't sort the first value, also we don't do any swapping here,
    //we are just shifting values.

    //time complexity of this algo is o(n^2) since we are using nested loops.

    public  static void main(String[] args) {

        int nums[]={7,2,5,6,3,8,1,9,4,0};

        // Start with the second element (index 1), assuming the first element (index 0) is already sorted
        for(int x = 1; x < nums.length; x++){

            int y = x -1; // Compare with the last sorted element
            int temp = nums[x]; //Takes the current element

            // Shift elements of the sorted part to the right if they are greater than temp
            while(y>=0 && nums[y]>temp){
                nums[y+1]=nums[y]; //we need a empty space, so shifts the larger one position to the right.
                y--;//we are reducing it to compare it with older values.
            }

            nums[y+1]=temp; //since we reduced the y, we add back to the empty spot.
        }

        for (int num: nums){
            System.out.print(num+" ");
        }

    }
}
