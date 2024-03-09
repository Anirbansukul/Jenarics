package CLASSESOBJECT;
class Bag{
	String name;
	double price;
	void setBoth(String name,double price) {
		this.name=name;
		this.price=price;
	}
	void display() {
		System.out.println("Name of the bag is:"+this.name);
		System.out.println("Price of the bag is:"+this.price);
	}
}
public class OWITHA {
	public static void main(String[] args) {
		Bag ob[]=new Bag[4];
		for(int i=0;i<ob.length;i++) {
			ob[i]=new Bag();
		}
		ob[0].setBoth("Safari",2900.49);
		ob[1].setBoth("Sky-Bags",2897.85);
		ob[2].setBoth("Lenevo",1000.77);
		ob[3].setBoth("Nahil",1200.98);
		for(int i=0;i<ob.length-1;i++) {
			for(int j=0;j<ob.length-i-1;j++) {
				if(ob[j+1].price<ob[j].price) {
					double temp=ob[j+1].price;
					ob[j+1].price=ob[j].price;
					ob[j].price=temp;
				}
			}
		}
		System.out.println("The sorting of the prices are:");
		for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i].price);
		}
		double max=ob[0].price;
		for(int i=0;i<ob.length;i++) {
			if(max<ob[i].price) {
				max=ob[i].price;
			}
		}
		System.out.println("Max bag price is:"+max);
		
		
		
	}

}
