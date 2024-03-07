//object and class example : main outside the class

//another class
//createing student class

class Student1{
    int id;
    String name;
}

class TestStudent1{
    public static void main(String args[]){
        Student1 myObj = new Student1();

        System.out.println(myObj.id);
        System.out.println(myObj.name);
    }
}