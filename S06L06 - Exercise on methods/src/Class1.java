import java.math.BigDecimal;

public class Class1 {

	public static void main(String[] args) {
		float a = 1.05f;
		float b = 2.55f;
		double x = 1.05;
		double y = 2.55;
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(d1.add(d2));
		
	}

}
