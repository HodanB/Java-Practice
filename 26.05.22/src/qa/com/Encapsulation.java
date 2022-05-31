package qa.com;

//Encapsulation = binding data with methods
public class Encapsulation {

	private int passportNumber;
	private String placeOfBirth;
//	Getters and Setters
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public static void main(String[] args) {
		Encapsulation Psg = new Encapsulation();
		Psg.setPassportNumber(12345);
		Psg.setPlaceOfBirth("London");
		System.out.println(Psg.getPassportNumber());
		System.out.println(Psg.placeOfBirth);
	}
	}

