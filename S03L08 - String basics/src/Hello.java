
public class Hello {

	public static void main(String[] args) {
		String var = "Hello world \u00BB";
		String var1 = "10";
		String var2 = "20";
		int var3 = 10;
		System.out.println(var);
		System.out.println(var1+var2);
		System.out.println(var3+var2);
		System.out.println(var3+20);
		System.out.println(var3+20+"hi ");
		
		String var4 = new String("Hello world");
		System.out.println(var4);
	}

}
