package CLASSESOBJECT;
class Box<T>{
	public<T1,T2> void printDetails( T1 obj1,T2 obj2) {
		System.out.println(obj1+"\n Type is:"+obj1.getClass().getName());
		System.out.println(obj2+"\n Type is:"+obj2.getClass().getName());
	}
}
public class Q5 {

	public static void main(String[] args) {
		Box ob=new Box();
		ob.printDetails("Anirban Sukul",18);
		
	}

}
