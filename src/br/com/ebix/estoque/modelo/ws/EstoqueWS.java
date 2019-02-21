package br.com.ebix.estoque.modelo.ws;

import br.com.ebix.estoque.modelo.item.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

@WebService
public class EstoqueWS {

    private ItemDao dao = new ItemDao();

    @WebMethod(operationName = "allItens")
    @ResponseWrapper(localName = "itens")
    @WebResult(name = "item")
    @RequestWrapper(localName="listaItens")
    public List<Item> getItens(@WebParam(name="filtros") Filtros filtros) {
        System.out.println("Buscando todos os itens");
        List<Filtro> lista = filtros.getLista();
        return dao.todosItens(lista);
    }
}
