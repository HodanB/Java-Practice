package qa.com.liskovsubstituitonExercise;

public class Penthouse {
	private int squareFootage;
    private int numberOfBedrooms;
    public Penthouse() {
    	
        this.setNumberOfBedrooms(4);
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
