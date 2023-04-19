package Transport.WaterTransport;

import Transport.TransportIF;

public class Ships implements TransportIF{
    public void DisplayInfo(){
        System.out.println("Вид транспорта: водный");
        System.out.println("Примеры транспорта: суда");
        System.out.println();
    }
}
