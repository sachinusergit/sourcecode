package superkey;

public class A {
	int i =10;
	
}




 class B extends A {
		int i = 30;
		 void show(int i) {
			System.out.println(super.i);
			System.out.println(this.i);
			System.out.println(i);
			
		}
	

	public static void main(String[] args) {
		B ob = new B();
		ob.show(50);
		// TODO Auto-generated method stub

	}

}

//Note - use of super and this keyword in java
 