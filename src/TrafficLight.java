public class TrafficLight implements ITrafficLight {
    // properties
    public static final int RED = 0; // constant, more readable than the numbers; public enables the use out of the class,
    public static final int GREEN = 1; // static means that is shared and the same in each instance of the class
    public static final int AMBER = 2;

    private int colour; // int for easiness, byte for saving diskspace, String inefficient and complex

    // constructors
    public TrafficLight () {
        setColour(RED); // sometimes is necessary to make checks which is better to include them on the setter
    }

    public TrafficLight (int colour) {
        // this(); the compiler does it automatically
        setColour(colour);
    }

    // setter
    public void setColour (int colour) {
        this.colour = colour;
    }

    // getter
    public int getColour () {
        return colour;
    }

    // specific methods
    public boolean equals (TrafficLight trafficLight) { // trafficLight is a parameter
        return this.colour == trafficLight.getColour();
    }

    public /* static */ boolean equals (TrafficLight trafficLight1, TrafficLight trafficLight2) { // unworthy
        return trafficLight1.getColour() == trafficLight2.getColour();
    }

    @Override
    public String toString () {
        return toColour();
    }

    public String toColour () {
        if (colour == 0) {
            return " RED";
        }
        else {
            if (colour == 1) {
                return " GREEN";
            }
            else{
                return " AMBER";
            }
        }
    }
}
