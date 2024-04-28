package superkey;

public class C {
	
	void m1() {
		System.out.println("I am in class A");
	}
}
	
	class D extends C{
		void m1() {
			System.out.println("I am in class B");
		}
		
		void show() {
			m1();
			super.m1();
		}
	

	public static void main(String[] args) {
		D d=new D();
		d.show();
		// TODO Auto-generated method stub

	}

}

