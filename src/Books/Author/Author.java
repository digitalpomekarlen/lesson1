package Books.Author;
import Books.Book;


import java.util.Scanner;

public class Author {

    private String nameAuthor;
    private String surnameAuthor;
    private String emailAuthor;
    private String genderAuthor;

    public Author(String nameAuthor, String surnameAuthor, String emailAuthor, String genderAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        this.emailAuthor = emailAuthor;
        this.genderAuthor = genderAuthor;
    }

    public Author() {
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    public String getEmailAuthor() {
        return emailAuthor;
    }

    public void setEmailAuthor(String emailAuthor) {
        this.emailAuthor = emailAuthor;
    }

    public String getGenderAuthor() {
        return genderAuthor;
    }

    public void setGenderAuthor(String genderAuthor) {
        this.genderAuthor = genderAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                ", emailAuthor='" + emailAuthor + '\'' +
                ", genderAuthor='" + genderAuthor + '\'' +
                '}';
    }
}
