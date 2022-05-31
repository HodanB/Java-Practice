package qa.com.liskovsubstituitonExercise;
//(abstract)
public abstract class Apartment {
    private int squareFootage;
    private int numberOfBedrooms;
    
	public int getSquareFootage() {
		return squareFootage;
	}
	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
}

    