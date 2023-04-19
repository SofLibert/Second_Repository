package Transport;

import Transport.WaterTransport.*;

class Program{
    public static void main(String[] args){
        Transport transport = new Transport();
        transport.FirstInfo();
        Ships ships = new Ships();
        ships.DisplayInfo();
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
