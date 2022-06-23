package Students;

public class StudentStorage{

    private Student[] array = new Student[10];
    int size = 0;


    public void add(Student student) {
        if(size == array.length){
            increaseArray();
        }
        array[size++] = student;
    }

    public void increaseArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i<size; i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.println( i + ". " + array[i] + " ");
        }
    }

    public int getSize(){
        return size;
    }

    public void delete(int index) {
        if(index >= 0 && index < size ){
            for(int i = index; i < size; i++ ){
                array[index] = array[index + 1];
            }
            size--;
            System.out.println("Index deleted");
        }else{
            System.out.println("Index out of bounds");
        }
    }

    public void printStudentsByLesson(String lessonName) {
        for (int i = 0; i < size; i++){
            if(array[i].getLesson().equals(lessonName)){
                System.out.println(array[i]);
            }else{
                System.out.println("Invalid lesson name");
            }
        }
    }

    public void changeLessonByIndex(int index1, String lessonChangeName) {
        for (int i = 0; i < size; i++) {
            if(i == index1){
                array[i].setLesson(lessonChangeName);
            }else{
                System.out.println("Invalid index");
            }
        }
    }
}
