package oops;

/*Difference between pass by value and pass by reference
 * Objects are always passed by reference
 * 
 */
public class Point {

	static int x;
	int y;
	
	public static void main(String[] args) {
		//swap(10,20);
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		
		System.out.println(p.x+ " --  "+p.y);
		swap(p.x, p.y);
		System.out.println(p.x+ " --  "+p.y);  // swap not for p.x and p.y success
		swap(p);
		System.out.println(p.x+ " --  "+p.y);  // swap success
		
	}
	
	public static void swap(int a, int b){   // pass by value
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void swap(Point t){  // pass by referece
		int temp=t.x;
		t.x=t.y;
		t.y=temp;
		
	}

}
