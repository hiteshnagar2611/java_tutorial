class ObjectClass{
	int x; // instance(object) member variable 
	int y; // instance(object) member variable
	private int z;
	
	void fun1(){ //instance(obect) member method(function)
		System.out.println("function of ObjectClass");
	}
}

class Area{
	static void fun1(){
		System.out.println("this is function of area class");
	}
}

class Example{
	static void fun1(){
		System.out.println("B");
	}
	
	static void fun2(){
		System.out.println("C");
	}
	
	static void fun3(){
		System.out.println("D");
	}
	
	static public void main(String []args){
	System.out.println("A");
	fun1();
	fun2();
	fun3();
	Area.fun1();
	
	// how access non static method (instance member method)
	// create a objec
	ObjectClass obj1 = new ObjectClass();
	obj1.x=51;
	
	obj1.fun1(); 
	
	System.out.println(obj1.x);
	System.out.println(obj1.y); // by default 0 is stored in variables
	System.out.println(obj1.z); // you don't access private 
	}
	
}
