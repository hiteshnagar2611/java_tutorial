// java program to illustrate the use of ststic variable which
//is shared with all objects

class Counter2 {
    static int count=0; //static variable

    Counter2(){
        count++;
        System.out.println(count);
    }

    public static void main(String args[]){
        // create object
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}
