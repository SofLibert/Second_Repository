package Transport.AirTransport;

import Transport.TransportIF;

public class AirTransport implements TransportIF{
    public void DisplayInfo(){
        System.out.println("Вид транспорта: воздушный");
        System.out.println("Примеры транспорта: самолёты и вертолёты");
        System.out.println();
    }
}
