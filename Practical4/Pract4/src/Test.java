public class Test{


    public class Quicksort {

        private static int []a;
        public static void main(String[] args) {
            // Get a random generated array

            a = getRandomArray();

            //a = getSortedArray();

            //a = getInverseArray();

            // prints the given array
            printArray();

            // sort the array
            sort();

            System.out.println("");

            //prints the sorted array
            printArray();

        }

        // This method sorts an array and internally calls quickSort

        public static void sort(){
            int left = 0;
            int right = a.length-1;

            quickSort(left, right);
        }

        // This method is used to sort the array using quicksort algorithm.
        // It takes the left and the right end of the array as the two cursors.

        private static void quickSort(int left,int right){

            // If both cursor scanned the complete array quicksort exits
            if(left >= right)
                return;

            // For simplicity, we took the rightmost item of the array as a pivot
            int pivot = a[right];
            int partition = partition(left, right, pivot);

            // Recursively, calls the quicksort with the different left and right parameters of the sub-array
            quickSort(0, partition-1);
            quickSort(partition+1, right);
        }

        // This method is used to partition the given array and returns the integer which points to the sorted pivot index

        private static int partition(int left,int right,int pivot){
            int leftCursor = left-1;
            int rightCursor = right;
            while(leftCursor < rightCursor){
                while(a[++leftCursor] < pivot);
                while(rightCursor > 0 && a[--rightCursor] > pivot);
                if(leftCursor >= rightCursor){
                    break;
                }else{
                    swap(leftCursor, rightCursor);
                }
            }
            swap(leftCursor, right);
            return leftCursor;
        }

        // This method is used to swap the values between the two given index

        public static void swap(int left,int right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }

        public static void printArray(){
            for(int i : a){
                System.out.print(i+" ");
            }
        }

        public static int[] getRandomArray(){
            int size=10000;
            int []array = new int[size];
            int item = 0;
            for(int i=0;i<size;i++){
                item = (int)(Math.random()*10000);
                array[i] = item;
            }
            return array;
        }

/*
    public static int[] getSortedArray(){
        int size=10000;
        int []array = new int[size];
        int item = 0;
        for(int i=0;i<size;i++){
            item = (int)(i);
            array[i] = item;
        }
        return array;
    }

    public static int[] getInverseArray(){
        int size=10000;
        int []array = new int[size];
        int item = 0;
        for(int i=0;i<size;i++){
            item = (int)(10000-i);
            array[i] = item;
        }
        return array;
    }
*/


    }
}
