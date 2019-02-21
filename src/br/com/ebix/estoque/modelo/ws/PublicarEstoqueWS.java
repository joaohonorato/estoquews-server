package br.com.ebix.estoque.modelo.ws;

import javax.xml.ws.Endpoint;

public class PublicarEstoqueWS {

    public static void main(String[] args) {

        EstoqueWS implementacaoWs = new EstoqueWS();
        String URL = "http://localhost:8080/estoquews";

        System.out.println("EstoqueWS rodando: " + URL +"?wsdl");

        Endpoint.publish(URL,implementacaoWs);
    }

}
