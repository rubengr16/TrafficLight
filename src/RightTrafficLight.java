public class RightTrafficLight extends TrafficLight implements IRightTrafficLight { // extends TrafficLight methods
    private int rightColour;

    public RightTrafficLight () {
        super(TrafficLight.RED);
        setRightColour(TrafficLight.RED);
    }

    public RightTrafficLight ( int colour, int rightColour) {
        super(colour);
        setRightColour(rightColour);
    }

    public void setRightColour (int rightColour) {
        this.rightColour = rightColour;
    }

    public int getRightColour (){
        return rightColour;
    }

    public String toString () { // Overriding
        return super.toString() + "," + rightColour;
    }

}
