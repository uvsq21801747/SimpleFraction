
public final class mainClass {

	public static void main(String[] args) {
		Fraction test = new Fraction();
		assert test.toString().equals("NAN") : "test n'est pas correct";
		Fraction test2 = new Fraction(1, 2);
		assert "1.0/2.0".equals(test2.toString()) : "test2 n'est pas correct";
		System.out.println(test);
		System.out.println(test2);
	}

}

