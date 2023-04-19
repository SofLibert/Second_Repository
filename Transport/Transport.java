package Transport;

import Transport.AirTransport.AirTransport;
import Transport.WaterTransport.*;

class Program{
    public static void main(String[] args){
        Transport transport = new Transport();
        transport.FirstInfo();
        WaterTransport waterTransport = new WaterTransport();
        waterTransport.DisplayInfo();
        AirTransport airTransport = new AirTransport();
        airTransport.DisplayInfo();
    }

}

public class Transport{
    Transport(){

    }

    public void FirstInfo(){
        System.out.println();
        System.out.println("Сейчас я расскажу вам про виды транспорта и приведу несколько примеров.");
        System.out.println();
    }
}
