// java program to demonstraate the use of a static method

class Student{
    int rollno;
    String name;
    static String college = "MBM";

    static void change(){
        college = "IIT";
    }

    //counter
    Student (int r, String n){
        rollno = r;
        name = n;
    }

    void display(){System.out.println(rollno + " " + name + " " + college);}
}

public class TestStaticMethd{
    public static void main(String args[]){
        Student.change(); // calling change method

        // creating objects
        Student s1 = new Student(111, "karan");
        Student s2 = new Student(12, "ram");
        
        s1.display();
        s2.display();

    }
}