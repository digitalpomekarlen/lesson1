package DynamycArray;

public class DynamicArray {

    int arr[];
    int count;

    public DynamicArray(int length) {
        arr = new int[length];
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public void add(int element) {
        if (arr.length == count) {
            int newArr[] = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = element;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getByIndex(int index) {
        if (isEmpty()) {
            return 0;
        } else {
            return arr[index];
        }
    }

    public int getFirstIndexByValue(int value) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                result = i;
        }
        return result;
    }
    
    public void set(int index,int value){
        arr[index] = value;
        System.out.println(arr[index]);
    }

    public void add(int index,int value){
        int tmp = 0;
        tmp = arr[index];
        arr[index] = value;

        for (int i = index + 1; i < count; i++) {
            arr[i] = arr[i + 1];
        }
        arr[index + 1] = tmp;

    }

    public void delete(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[count - 1] = 0;
            count--;
        }
    }

}
