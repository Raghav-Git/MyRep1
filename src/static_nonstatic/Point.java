package static_nonstatic;

public class Point {

	int x;
	int y;
	
	public static void main(String[] args) {

		Point p = new Point();
		p.x=10;
		p.y=20;
		
		System.out.println(p.x+" - "+p.y);
		//swap(p.x, p.y);
		swap(p);
		System.out.println(p.x+" - "+p.y);
	}

	public static void swap(int a, int b){
		
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void swap(Point t){
		int temp=t.x;
		t.x=t.y;
		t.y=temp;
	}
}
