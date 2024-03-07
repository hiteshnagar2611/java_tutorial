//object initializaion through refrence

class Student3{
    int id;
    String name;
}

class TestStudent2{
    public static void main(String args[]){
        //creating object
        Student3 o1 = new Student3();

        o1.id = 101;
        o1.name = "hitesh";

        System.out.println(o1.id + " " + o1.name);
    }
}