package h1;

public class H1_main {
	public static void main(String[] args) {

		Zahl z = new Zahl();
		z.num = -16;

		z.setEven();
		z.setPositive();
		z.setSmall();

		System.out.println("Zahl: " + z.num);
		System.out.println("Gerade (even): " + z.even);
		System.out.println("Positiv (positive): " + z.positive);
		System.out.println("Kleiner als 100 (small): " + z.small);
	}
}