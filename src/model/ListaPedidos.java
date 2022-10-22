package model;

import java.util.ArrayList;

public class ListaPedidos {
    private ArrayList<Pedido> pedidos;

    public void setPedidos(ArrayList<Pedido> pedidos)
    {
        this.pedidos=pedidos;
    }

    public ListaPedidos() {
        this.pedidos=new ArrayList<>();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedido)
    {
        pedidos.add(pedido);
    }
}



