package arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ',' ',' ','b','v','s','t',' ',' ','g','t',' ',' '};
        int indexOfFirst = 0;
        int indexOfLast = 0;
        for(int i = 0; i < spaceArray.length; i++){
            if(spaceArray[i] != ' '){
                indexOfFirst = i;
                break;
            }
        }
        for(int i = spaceArray.length - 1; i >= 0; i--){
            if(spaceArray[i] != ' '){
                indexOfLast = i;
                break;
            }
        }
        char[] result = new char[indexOfLast - indexOfFirst + 1];
        for (int i = 0; i < result.length; i++){
                result[i] = spaceArray[indexOfFirst + i];
        }
        for(char a:result){
            System.out.print(a);
        }
    }
}
