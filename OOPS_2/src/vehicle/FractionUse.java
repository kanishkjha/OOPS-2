package vehicle;

public class FractionUse {
	
	public static void temp() {
		
		Fraction f1=null;
		try {
			f1 = new Fraction(20,30);
			f1.print();
		} catch (ZeroDenominatorException e) {
			System.out.print("Hey! Don't put 0 as a denominator.");
		}
		
		// 2/3
		
		f1.setNumerator(12);
		// 4/1
		int d= f1.getDenominator();
		System.out.println(d);
		f1.print();
		
		f1.setNumerator(10);
		try {
			f1.setDenominator(30);
		} catch (ZeroDenominatorException e) {
			System.out.print("Hey! Don't put 0 as a denominator.");
		}
		// 1/3
		f1.print();
		
		Fraction f2=null;
		try {
			f2 = new Fraction(3,4);
		} catch (ZeroDenominatorException e) {
			System.out.print("Hey! Don't put 0 as a denominator.");
		}
		f1.add(f2);
		f1.print();
		// f1=> 13/12
		f2.print();
		// f2=> 3/4
		
		Fraction f3=null;
		try {
			f3 = new Fraction(4,5);
		} catch (ZeroDenominatorException e) {
			System.out.print("Hey! Don't put 0 as a denominator.");
		}
		f3.multiply(f2);
		f3.print();
		// f3=> 3/5
		f2.print();
		// f2=> 3/4
		
		Fraction f4=null;
		try {
			f4 = Fraction.add(f1, f3);
		} catch (ZeroDenominatorException e) {
			System.out.print("Hey! Don't put 0 as a denominator.");
		} finally {
			System.out.println("Finally will execute, no matter what.");
		}
		
		f1.print();
		// f1=> 13/12
		f3.print();
		// f3=> 3/5
		f4.print();
		// f4=> 101/60
	}

	public static void main(String[] args) {
		
		temp();

	}

}
