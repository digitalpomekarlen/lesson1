package Books;

import Books.Author.Author;
import Books.Author.AuthorStorage;
import Students.Student;
import Students.StudentStorage;

import java.util.Scanner;

public class BookDemo implements BookInterface {

    private static Scanner scanner = new Scanner(System.in);
    private  static BookStorage bookStorage = new BookStorage();

    private static AuthorStorage authorStorage = new AuthorStorage();



    public static void main(String[] args) {

        boolean run = true;
        while(run){
            System.out.println("Please input " + EXIT + " for exit");
            System.out.println("Please input " + ADD_BOOK + " for add book");
            System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by Author name ");
            System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for to print books by genre");
            System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
            int command = Integer.parseInt(scanner.nextLine());


            switch (command){
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    System.out.println("Please input author name");
                    String authorName = scanner.nextLine();
                    bookStorage.printBookByAuthorName(authorName);
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    System.out.println("Please input genre");
                    String genre = scanner.nextLine();
                    bookStorage.printBookByGenre(genre);
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("Please input minimal price");
                    String priceMinStr = scanner.nextLine();
                    double priceMin = Double.parseDouble(priceMinStr);
                    System.out.println("Please input maximal price");
                    String priceMaxStr = scanner.nextLine();
                    double priceMax = Double.parseDouble(priceMaxStr);
                    bookStorage.printBooksByPriceRange(priceMin,priceMax);
                default:
                    System.out.println("Invalid command,please try again");
            }
        }

    }

    private static  void addBook(){

        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input book author by fields ");
        Author author = addAuthor();

        System.out.println("Please input book price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input books count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();

        double price = Double.parseDouble(priceStr);
        int count = Integer.parseInt(countStr);
        Book book = new Book(title,author,price,count,genre);

        bookStorage.add(book);
        System.out.println("Thank you");
    }

    private static Author addAuthor(){
        boolean run = true;
        System.out.println("Please input author name");
        String nameAuthor = scanner.nextLine();
        System.out.println("Please input author surname");
        String surnameAuthor = scanner.nextLine();
        System.out.println("Please input author email");
        String emailAuthor = scanner.nextLine();
        String genderAuthor = "";
        while (run){
            System.out.println("Please input author gender MALE OR FEMALE");
            String genderAuthor1 = scanner.nextLine();
            if(genderAuthor1.equals("MALE") || genderAuthor1.equals("FEMALE")){
                genderAuthor = genderAuthor1;
                run = false;
            }else{
                System.out.println("Invalid gender name");
                addAuthor();
            }

        }
        Author author = new Author(nameAuthor,surnameAuthor,emailAuthor,genderAuthor);
        authorStorage.add(author);
        return author;
    }
}
