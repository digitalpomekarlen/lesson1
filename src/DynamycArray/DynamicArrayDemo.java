package DynamycArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
            DynamicArray array = new DynamicArray(10);
            array.add(8);
            array.add(9);
            array.add(1);
            array.add(0);
            array.add(4);
//            array.printArray();
//            System.out.println(array.isEmpty());
//            System.out.println(array.getByIndex(8));
//            System.out.println(array.getFirstIndexByValue(1));
//            array.set(0,4);
//            array.delete(0);
//            array.printArray();
//            System.out.println(" ");
            array.add(2,6);
            array.printArray();

    }
}
