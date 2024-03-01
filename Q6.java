package CLASSESOBJECT;
class AS<T>{
	public<T1,T2>AS(T1 obj1,T2 obj2){
		System.out.println(obj1+"\n and the Type is:"+obj1.getClass().getName());
		System.out.println(obj2+"\n and the Type is:"+obj2.getClass().getName());
	}
}
public class Q6 {

	public static void main(String[] args) {
		AS ob=new AS("Anirban Sukul",18);

	}

}
