package OOP;

public class Human {
      String firstname;
      String lastname;
     private int age;

     public int getAge() {
          if(age > 18)
          return age;else
               return -1;
     }

     public void setAge(int age) {
          this.age = age;
     }

     @Override
     public String toString() {
          return this.firstname;
     }

     public void sayHello(){
          System.out.println("Hello");
     }
}
