package static_and_nonstatic;

public class ValueAndReference {

	int x;
	int y;
	
	
	
	
	public void swap(ValueAndReference t){ 		// pass by reference
		
		int temp = t.x;
		t.x=t.y;
		t.y=temp;
		
		
	}
	
	public void swap(String a, int b){		// function overloading
		
	}
	
	public void swap(int a, int b){  					// pass by value
		
		//System.out.println(a+" - "+b);
		
		int temp = a;  //temp=10, a=10, b=20
		a=b;			//a=20, b=20. temp=10
		b=temp;			//b=10
		
		//System.out.println(a+" - "+b);
		
	}

	
	public static void main(String[] args) {

		ValueAndReference v = new ValueAndReference();
		v.x=100;
		v.y=200;
		
		System.out.println(v.x+" - "+v.y);  // 100 - 200
		
		v.swap(v.x, v.y);
		v.swap(v);
		
		System.out.println(v.x+" - "+v.y);  // 200 - 100
	}
	
}
