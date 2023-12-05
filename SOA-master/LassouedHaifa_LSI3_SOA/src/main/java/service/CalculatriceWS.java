package service;

import jakarta.jws.*;

@WebService
public class CalculatriceWS {

    //Methode permettant de calculer la somme de deux reels de type Double a partir du service SoapUI
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}


