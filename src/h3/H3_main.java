package h3;

public class H3_main {
	public static void main(String[] args) {

		Mensch m = new Mensch();

		m.setName("Elsa");
		m.setGebJahr(1965);
		m.setAlter();

		System.out.println("Name: " + m.getName());
		System.out.println("Geburtsjahr: " + m.getGebJahr());
		System.out.println("Alter: " + m.getAlter());
	}
}