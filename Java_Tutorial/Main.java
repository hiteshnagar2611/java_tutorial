public class Main{

    static void myMethod(){
        System.out.println("my name is hitesh");
    }

    public static void main(String[] args){
        //this is comment
        System.out.println("love you maa");

        String name = "hitesh nagar kota";
        System.out.println("total caracter in string is : " + name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("nagar"));

        //The + operator can be used between strings to combine them. This is called concatenation
        String firstname = "Hitesh";
        String lastname = "Nagar";
        System.out.println(firstname + " " + lastname);

        //If you add a number and a string, the result will be a string concatenation
        String x="10";
        int y=20;
        //String z=x+y; by this we got same result
        System.out.println(x+y);

        String a = "10";
        String b = "20";
        String c = a + b;  // z will be 1020 (a String)
        System.out.println(a+b);

        //Because strings must be written within quotes, Java will misunderstand this string, and generate an error
        //he solution to avoid this problem, is to use the backslash escape character
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        //The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.max(10,20));
        //The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.min(10,20));
        //The Math.sqrt(x) method returns the square root of x
        System.out.println(Math.sqrt(64));
        //The Math.abs(x) method returns the absolute (positive) value of x
        System.out.println(Math.abs(-15.4));
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());
        //To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:
        int randomNum = (int)(Math.random() * 101);  // 0 to 100 ,100 included
        System.out.println(randomNum);

        myMethod();
        myMethod();

        
    } 
}