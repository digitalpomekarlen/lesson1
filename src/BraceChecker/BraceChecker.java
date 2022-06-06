package BraceChecker;

public class BraceChecker {

    public String text;

    public BraceChecker(String text){
        this.text = text;
    }



    public void check(){

        int stackSize = text.length();
        Stack myStack = new Stack(stackSize);

        for (int j = 0; j < text.length(); j++)
        {
            char ch = text.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    myStack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!myStack.isEmpty())
                    {
                        char chx = myStack.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
                                || (ch == ')' && chx != '('))
                            System.out.println("Error: " + "opened " + ch + " but closed " + chx + " at " + j);
                    } else
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    break;
            }
        }
    }
}
