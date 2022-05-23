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
        for (int j = indexOfFirst; j <= indexOfLast; j++){
            System.out.print(spaceArray[j]);
        }
    }
}
