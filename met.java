class Vin{}
class Vis{}
class Har{}
class Nar{}

class Anv



{
	void m1(Vin x, Vis y){
		
		System.out.println("m1 method");
	}
	static void m2(Har h, Nar z){
		
		System.out.println("m2 method");
	
	}
	public static void main(String[] args) 
	{
		Anv n =new Anv();
		Vin x = new Vin();
		Vis y = new Vis();
		n.m1(x,y); //n.m1(new Vin(),new Vis());

		Har h = new Har();
		Nar z = new Nar();
		Anv.m2(h,z);//Anv.m2(new Har(), new Nar());

	}
}
