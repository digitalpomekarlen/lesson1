package Collections;


import java.util.*;

public class CollectionExamples {

        public static void main(String[] args) {

            String[] arr = new String[]{"1","2","3","4"};
            System.out.println(arrayToList(arr));
            ArrayList<String> arrayListString = new ArrayList<String>();
            arrayListString.add("a");
            arrayListString.add("b");
            arrayListString.add("c");
            arrayListString.add("d");
            arrayListString.add("e");
            arrayListString.add("f");
            arrayListString.add("g");
            arrayListString.add("h");
            arrayListString.add("m");
            arrayListString.add("n");
            ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
            arrayListInteger.add(1);
            arrayListInteger.add(2);
            arrayListInteger.add(3);
            arrayListInteger.add(4);
            arrayListInteger.add(5);
            System.out.println(removeById(arrayListString,2));
            System.out.println(listToSet(arrayListString));
            System.out.println(listToLinkedList(arrayListInteger));
            System.out.println(reverseNumbers(arrayListInteger));
            printFirstFive(arrayListString);
            System.out.println("Element count is " + sizeOfList(arrayListString));

        }

        //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
        static List<String> arrayToList(String[] values) {
            List<String> list = Arrays.asList(values);
            return list;
        }

        //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
        static List<String> removeById(List<String> list, int index) {
            list.remove(index);
            return list;
        }

        // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
        static Set<String> listToSet(List<String> list) {

            Set<String> set = new HashSet<String>(list);
            return set;
        }

        // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
        static LinkedList<Integer> listToLinkedList(List<Integer> list) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            for (Integer i: list) {
                linkedList.add(Integer.valueOf(i));
            }
            return linkedList;
        }

        // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
        static List<Integer> reverseNumbers(List<Integer> list) {
            ArrayList<Integer> newList = new ArrayList<Integer>();

            Collections.reverse(list);

            newList.addAll(list);
            return newList;
        }

        // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
        static void printFirstFive(List<String> list) {
            for(int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }
        }

        // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
        static int sizeOfList(List<String> list){
            int count = 0;
            count = list.size() + 1;
            return count;
        }

    }
