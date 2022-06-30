package Books.Author;


import Books.Book;

public class AuthorStorage {

    private Author[] array = new Author[10];
    int size = 0;


    public void add(Author author) {
        if(size == array.length){
            increaseArray();
        }
        array[size++] = author;
    }

    public void increaseArray() {
        Author[] temp = new Author[array.length + 10];
        for (int i = 0; i<size; i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    public  void print(){
        for (int i = 0; i < size; i++){
            System.out.println( i + ". " + array[i] + " ");
        }
    }


}
