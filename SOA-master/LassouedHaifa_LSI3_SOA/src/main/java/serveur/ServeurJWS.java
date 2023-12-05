package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {

        //Instantiation du calculatriceWS
        CalculatriceWS calculatrice =new CalculatriceWS();

        //Publication du service web sur le port 8085
        String url ="http://localhost:8085/";
        Endpoint.publish(url, calculatrice);

        System.out.println("Server url:"+ u



                rl);

    }
}