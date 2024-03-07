//object initializaion through method 

class Student3{
    int id;
    String name;

    void insert(int i, String n){
        id = i;
        name = n;
    }

    void print(){
        System.out.println(id + " " + name);
    }
}

class TestStudent3{
    public static void main(String args[]){

        Student3 o1 = new Student3();

        o1.insert(101, "hitesh");

        o1.print();
    }
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