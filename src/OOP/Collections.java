package OOP;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {

       //Lists
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(2);
        a.add(0);
        System.out.println(a);
        a.add(3,7);
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        //boolean i = a.remove(Integer.valueOf(40));
        //System.out.println(i);
        a.set(2,-7);
        System.out.println(a);
        System.out.println(a.indexOf(-7));
        System.out.println(a.get(0));
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++ ){
            System.out.println(a.get(i));
        }

    }


}
