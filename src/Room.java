public class Room {
    double roomArea;
    double currentTemperature;
    boolean isAirConditioner;

    public Room(double roomArea, double currentTemperature, boolean isAirConditioner) {
        this.roomArea = roomArea;
        this.currentTemperature = currentTemperature;
        this.isAirConditioner = isAirConditioner;
    }
    boolean lowerTemperature (){
        if (isAirConditioner == true && currentTemperature > 18) {
            currentTemperature -= 1;
            return true;
        } else return false;
    }
}
