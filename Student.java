public class Student {

    String name;
    int rollno;

    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public void display(){
        System.out.println("The name of the student is chaged in the github " + name + " the rollno is " + rollno);
    }

    public static void main(String[] args){

    Student s1 = new Student("Jagan", 101);

    s1.display();

    }
    
}
