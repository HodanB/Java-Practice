package qa.com.liskovsubstituiton;

public abstract class Bird {
    private int altitude;
    public abstract void fly();

    public int getAltitude() {
        return altitude;
    }

}
