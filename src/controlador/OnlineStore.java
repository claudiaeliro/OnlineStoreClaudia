package controlador;

import view.*;
import model.*;

public class OnlineStore {

    public static void main(String[] args) {

        ListaArticulos modeloListaArticulos= new ListaArticulos();
        ListaPedidos modeloListaPedidos= new ListaPedidos();
        ListaClientes modelListaClientes= new ListaClientes();
        Articulo modelArticulo = new Articulo();
        ClienteEstandard modelClienteEstadard = new ClienteEstandard();
        ClientePremium modelClientePremium= new ClientePremium();
        Pedido modelPedido= new Pedido();

        OnlineStoreView view= new OnlineStoreView() ;
        OnlineStoreContoller con = new OnlineStoreContoller(modeloListaArticulos,  modeloListaPedidos, modelListaClientes,modelArticulo, modelClienteEstadard, modelClientePremium,modelPedido,view);

        con.menuInicio();



    }



}
