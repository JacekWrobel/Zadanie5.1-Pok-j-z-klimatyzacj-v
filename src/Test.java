public class Test {
    public static void main(String[] args) {

        Room room1 = new Room (10, 20,true);
        Room room2 = new Room (20, 15,true);
        Room room3 = new Room (30, 20,false);
        Room room4 = new Room (30, 20);


        System.out.println(room1.getRoomArea() +" " +room1.getCurrentTemperature() +" " +room1.isAirConditioner());
        System.out.println(room2.getRoomArea() +" " +room2.getCurrentTemperature() +" " +room2.isAirConditioner());
        System.out.println(room3.getRoomArea() +" " +room3.getCurrentTemperature() +" " +room3.isAirConditioner());
        System.out.println(room4.getRoomArea() +" " +room4.getCurrentTemperature() +" " +room4.isAirConditioner());

       /* room1.lowerTemperature();
        room2.lowerTemperature();
        room3.lowerTemperature();
       */
        System.out.println(room1.lowerTemperature() +" "+room1.getRoomArea() +" " +room1.getCurrentTemperature() +" " +room1.isAirConditioner());
        System.out.println(room2.lowerTemperature() +" "+room2.getRoomArea() +" " +room2.getCurrentTemperature() +" " +room2.isAirConditioner());
        System.out.println(room3.lowerTemperature() +" "+room3.getRoomArea() +" " +room3.getCurrentTemperature() +" " +room3.isAirConditioner());
        System.out.println(room4.lowerTemperature() +" "+room4.getRoomArea() +" " +room4.getCurrentTemperature() +" " +room4.isAirConditioner());



    }
}
