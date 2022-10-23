package model;

import java.util.ArrayList;

public class Datos {
    private ListaArticuloss  listaArticuloss;
    private Articulo articulo ;
    private ClienteEstandard  clienteEstandard;
    private ListaClientess listaClienteEstandardd;

    public Datos()
    {
        listaArticuloss = new ListaArticuloss ();
        listaClienteEstandardd= new ListaClientess();
        articulo= new Articulo();
        clienteEstandard= new ClienteEstandard();
    }

    public ClienteEstandard getClienteEstandard() {
        return clienteEstandard;
    }
    public void inicializoClienteEstandard() {
        clienteEstandard=new ClienteEstandard();
    }
    public ArrayList<Cliente> getListaClienteEstandard(){
        return listaClienteEstandardd.getArrayList();
    }
    public void AddListaClienteEstandard(ClienteEstandard cliente)
    {
        listaClienteEstandardd.lista.add(cliente);
    }

    public Articulo getArticulo()
    {
        return articulo;
    }
    public void inicializoArticulo()
    {
        articulo=new Articulo();
    }

    public ArrayList<Articulo> getListaArticuloss() {
        return listaArticuloss.getArrayList();

    }
    public void AddListaArticuloss(Articulo articulo) {
        listaArticuloss.lista.add(articulo);
    }

    public int comprobarArticulo(String id)
    {
        for(int i=0; i<(listaArticuloss.lista.size()); i++)
        {
            if (id.equals(listaArticuloss.lista.get(i).getCodigo()))
            {
                return i;
            }
        }
        return -1;
    }
    public void borrarArticulo(int posicion)
    {
        listaArticuloss.lista.remove(posicion);
    }



}
