package qa.com.liskovsubstituitonExercise;

public class Studio {
	private int squareFootage;
    private int numberOfBedrooms;
    
    public Studio() {
        this.setNumberOfBedrooms(0);
    }

    public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getSquareFootage() {
		return squareFootage;
	}
}