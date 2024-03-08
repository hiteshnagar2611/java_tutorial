package java_tutorial.static_variables;

//java program to demonstrate the use of static variable
class Student{
    int rollno;
    String name;
    static String college="HII";//static variable
    
    //constructor
    Student(int r, String n){
        rollno=r;
        name=n;
    }

    //method to display values
    void display(){
        System.out.println(rollno+" "+name+" "+ college);
    }

}

//test class to show values of objects
public class TestStaticVariable1{
    public static void main(String args[]){
        Student s1=new Student(111,"hitesh");
        Student s2=new Student(222,"ram");

        //we can change college of all object by the single line of code
        //Student.college = "MBM";
        s1.display();
        s2.display();
    }
}