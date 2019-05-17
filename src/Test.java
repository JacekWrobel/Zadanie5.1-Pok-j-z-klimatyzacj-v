public class Test {
    public static void main(String[] args) {

        Room room1 = new Room (10, 20, true);
        Room room2 = new Room (20, 15,true);
        Room room3 = new Room (30, 20,false);

        System.out.println(room1.roomArea +" " +room1.currentTemperature +" " +room1.isAirConditioner);
        System.out.println(room2.roomArea +" " +room2.currentTemperature +" " +room2.isAirConditioner);
        System.out.println(room3.roomArea +" " +room3.currentTemperature +" " +room3.isAirConditioner);

       /* room1.lowerTemperature();
        room2.lowerTemperature();
        room3.lowerTemperature();
       */
        System.out.println(room1.lowerTemperature() +" "+room1.roomArea +" " +room1.currentTemperature +" " +room1.isAirConditioner);
        System.out.println(room2.lowerTemperature() +" "+room2.roomArea +" " +room2.currentTemperature +" " +room2.isAirConditioner);
        System.out.println(room3.lowerTemperature() +" "+room3.roomArea +" " +room3.currentTemperature +" " +room3.isAirConditioner);



    }
}
