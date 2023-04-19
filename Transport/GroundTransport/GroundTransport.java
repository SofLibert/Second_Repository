package Transport.GroundTransport;

import Transport.TransportIF;

public class GroundTransport implements TransportIF{
    public void DisplayInfo(){
        System.out.println("Вид транспорта: наземный");
        System.out.println("Примеры транспорта: моноциклы, бициклы, трициклы, квадроциклы и моноколесо");
        System.out.println();
    }
}
