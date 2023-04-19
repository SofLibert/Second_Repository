package Transport.RailwayTransport;

import Transport.TransportIF;

public class RailwayTransport implements TransportIF{
    public void DisplayInfo(){
        System.out.println("Вид транспорта: железнодорожный");
        System.out.println("Примеры транспорта: локомотивы и вагоны");
        System.out.println();
    }
}
