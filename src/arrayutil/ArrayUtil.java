package arrayutil;
import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {50, 14, 458, 8, 43, 97, 1, 11, 122, 789};

        //Print all elements
        System.out.println("Array elements is");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Print маx element
        System.out.print("Max element of Array is ");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        //Print min element
        System.out.print("Min element of Array is ");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        //Odd elements and count
        int countOdd = 0;
        System.out.println("Odd elements of Array is ");
        for(int i = 0;i < array.length;i++){
            if(array[i] % 2 == 1) {
                System.out.println(array[i]);
                countOdd++;
            }

        }
        System.out.println("Odd elements count is " + countOdd);

        //Even elements and count
        int countEven = 0;
        System.out.println("Even elements of Array is ");
        for(int i = 0;i < array.length;i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
                countEven++;
            }
        }
        System.out.println("Even elements count is " + countEven);

        //The arithmetic average of array
        System.out.println("The arithmetic average of array is ");
        double sumAverage = 0;
        for(int i = 0;i < array.length;i++) {
            sumAverage += array[i];
        }
        System.out.println(sumAverage / 2);

        //The sum of elements array
        System.out.println("The sum of elements array is ");
        double sumElements = 0;
        for(int i = 0;i < array.length;i++) {
            sumElements += array[i];
        }
        System.out.println(sumElements);

        //Reverse array elements
        System.out.println("Reverse array elements");
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        //Bubble sorting
        System.out.println("Bubble sorting is");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }//or
        //System.out.println(Arrays.toString(array));

        //Selection sort of array
        System.out.println("Selection sort of array is ");
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temporary = array[i];
            array[i] = min;
            array[minId] = temporary;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //or
        //System.out.println(Arrays.toString(array));

    }
}