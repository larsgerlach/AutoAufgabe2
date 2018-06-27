package aufgabe;

public class Auto {

	private int anzahlRaeder;
	private Motor motor = new Motor();

	public void starten() {
		motor.setAn(true);
	}

	public void ausschalten() {
		motor.setAn(false);
	}

	public void zusammenbauen(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public int getRaeder() {
		return anzahlRaeder;
	}

	public boolean istMotorAn() {
		return motor.getAn();
	}
}
