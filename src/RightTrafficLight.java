public class RightTrafficLight extends TrafficLight{ // extends TrafficLight methods
    private int rightColour;

    public RightTrafficLight() {
        super(TrafficLight.RED);
        setRightColour(TrafficLight.RED);
    }

    public RightTrafficLight( int colour, int rightColour) {
        super(colour);
        setRightColour(rightColour);
    }

    public void setRightColour(int rightColour) {
        this.rightColour = rightColour;
    }

    public int getRightColour(){
        return rightColour;
    }


}
