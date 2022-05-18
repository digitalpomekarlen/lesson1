package arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        //1)Count of char symbol
        char[] chars = {'j','a','v','a','l','o','v','e'};
        char c = 'o';
        int count = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == c)
                count++;
        }
        System.out.println("Count of symbol 'o' is " + count);

        //2)Print 2 middle symbols
            System.out.println("2 middle symbols is ");
            System.out.println(chars[chars.length / 2 - 1]);
            System.out.println(chars[chars.length / 2]);

        //3)Print true or false
        System.out.println("2 next symbols is'ly' ");
        char[] chars1 ={'j','a','v','a','l','o','l','y'};
        if(chars1[chars1.length - 2] == 'l' && chars1[chars1.length - 1] == 'y'  )
            System.out.println("true");else
            System.out.println("false");

        //4)BobArray
        System.out.println("An array have word BOB? ");
        char[] bobArray = {'b','a','b','o','l','a'};
        char countOfSymbolB = 0;
        if(bobArray.length > 3 ) {
            for (int i = 0; i < bobArray.length - 2; i++) {
                if (bobArray[i] == 'b' && bobArray[i + 2] == 'b')
                    countOfSymbolB++;
            }
            if(countOfSymbolB >= 1)
                System.out.println("True");else
                System.out.println("False");
            }else if(bobArray.length == 3){
            if(bobArray[0] == 'b' && bobArray[2] == 'b')
                System.out.println("true");else
                System.out.println("False");
            }else if(bobArray.length < 3){
            System.out.println("False");
        }

        //5)Print symbols not space
        System.out.println("Symbols none space is ");
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for(int i = 0; i < text.length; i++){
            if(text[i] != ' ' )
                System.out.println(text[i]);
        }



















    }
}
