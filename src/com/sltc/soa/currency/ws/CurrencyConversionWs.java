package com.sltc.soa.currency.ws;

import com.sltc.soa.currency.service.CurrencyConversionService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

/**
 * @author Daham-Kahawearachchi
 * @date 23-12-2022
 * @file_name CurrencyConversionWs
 * @project_Name SoapCurrencyConvertorWebServer
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)

public class CurrencyConversionWs {

    @WebMethod // Generating web method that client resetting to the server
    public  double convert(double amountInSourceCurrency, String sourceCurrency, String targetCurrency){
        CurrencyConversionService service = new CurrencyConversionService();
        return service.convert(amountInSourceCurrency, sourceCurrency, targetCurrency);
    }

    public static void main(String[] args){
        //Hosting the wsdl file in given url for communicating with the client.
        Endpoint.publish("http://localhost:8888/CurrencyConversionService", new CurrencyConversionWs());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("------------------------- Web Service is Running ----------------------");
        System.out.println("-----------------------------------------------------------------------");

       // System.out.println(new CurrencyConversionWs().convert(100, "AED", "USD"));
    }
}
