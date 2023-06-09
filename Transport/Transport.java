package Transport;

import Transport.AirTransport.AirTransport;
import Transport.GroundTransport.GroundTransport;
import Transport.RailwayTransport.RailwayTransport;
import Transport.WaterTransport.*;

class Program{
    public static void main(String[] args){
        Transport transport = new Transport();
        transport.FirstInfo();
        WaterTransport waterTransport = new WaterTransport();
        waterTransport.DisplayInfo();
        AirTransport airTransport = new AirTransport();
        airTransport.DisplayInfo();
        GroundTransport groundTransport = new GroundTransport();
        groundTransport.DisplayInfo();
        RailwayTransport railwayTransport = new RailwayTransport();
        railwayTransport.DisplayInfo();
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
