//Object and Class Example: main within the class

class Student{
    //defining fileds
    int id;
    String name;


    public static void main(String args[]){

        //creating an object or instance
        Student s1 = new Student();

        //assesing memeber through refrence variable
        System.out.println(s1.id);
        System.out.println(s1.name);

    }
}