package qa.com.liskovsubstituitonExercise;

public class BedroomAdder {
    public void addBedroom(Penthouse penthouse) {
    	penthouse.setSquareFootage(apartment.getSquareFootage() + 40);

        if (!(apartment instanceof Studio)) {
        	penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 2);
        }
    }
}