public class Room {
    private double roomArea;
    private double currentTemperature;
    private boolean isAirConditioner;

    public double getRoomArea() {
        return roomArea;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public boolean isAirConditioner() {
        return isAirConditioner;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setAirConditioner(boolean airConditioner) {
        isAirConditioner = airConditioner;
    }

    public Room(double roomArea, double currentTemperature) {
        this.roomArea = roomArea;
        this.currentTemperature = currentTemperature;
    }

    public Room(double roomArea, double currentTemperature, boolean isAirConditioner) {
        this (roomArea, currentTemperature);
        this.isAirConditioner = isAirConditioner;

    }
    boolean lowerTemperature (){
        if (isAirConditioner == true && currentTemperature > 18) {
            currentTemperature -= 1;
            return true;
        } else return false;
    }
}
