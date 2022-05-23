package arrayutil;

public class ArraySort {

    public static void main(String[] args) {

        //1)Array sort
        int[] numbers = {43,47,5,-4,56,23,-45,896,12};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSorted = false;

                    buf = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = buf;
                }
            }
        }
        System.out.println("Array elements is ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements is ");
        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }



}
