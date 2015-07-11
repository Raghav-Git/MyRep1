
public class StarsLoop {


	public static void main(String[] args) {

		int num = 20;
		int halfNum = num/2;

		for(int i=0;i<num;i++){
			if(i<= 10){
				for(int j=0;j<i;j++){
					System.out.print("*");
				}
			}
			if(i>10){
				for(int j=20; j>i; j--){
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
