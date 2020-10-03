public class Crossroads {
    TrafficLight lightNE, lightSE, lightSW, lightNW; // declarations, they point null

    public Crossroads () {
        lightNE = new TrafficLight(); // instances
        lightSE = new TrafficLight();
        lightSW = new TrafficLight();
        lightNW = new TrafficLight();
    }

    public void horizontalWay () {
        lightNE.setColour(TrafficLight.GREEN);
        lightSW.setColour(TrafficLight.GREEN);
        lightSE.setColour(TrafficLight.RED);
        lightNW.setColour(TrafficLight.RED);
    }

    public void VerticalWay () {
        lightSE.setColour(TrafficLight.GREEN);
        lightNW.setColour(TrafficLight.GREEN);
        lightNE.setColour(TrafficLight.RED);
        lightSW.setColour(TrafficLight.RED);
    }

}
