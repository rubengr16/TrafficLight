public interface ITrafficLight {
    int RED = 0;
    int GREEN = 1;
    int AMBER = 2;

    void setColour (int colour);
    int getColour ();
    boolean equals (TrafficLight trafficLight);
    boolean equals (TrafficLight trafficLight1, TrafficLight trafficLight2);
    String toString ();
    String toColour ();
}
