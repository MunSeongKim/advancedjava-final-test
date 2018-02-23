package prob02;

public class Div implements Arithmetic {
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		if( b == 0 ) {
			System.out.println("Cannot calculate for divide");
			return 0;
		}
		
		return (a / b);
	}
}
