import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        TrafficLight lightCastellana = new TrafficLight();
        TrafficLight lightCuzco = new TrafficLight();
        RightTrafficLight rightLight = new RightTrafficLight();
                // declaration            instances

        System.out.println("Traffic Light Castellana:" + lightCastellana.toString() + " and Traffic Light Cuzco: " + lightCuzco.toString() +
                ". Equals?: " + lightCastellana.equals(lightCuzco));

        lightCuzco.setColour(TrafficLight.AMBER); // TrafficLight.CONSTANT in order to access the STATIC constant

        System.out.println("Traffic Light Castellana:" + lightCastellana.toString() + " and Traffic Light Cuzco: " + lightCuzco.toString() +
                ". Equals?: " + TrafficLight.equals(lightCastellana,lightCuzco)); // name the class to access the static method
    }
}
