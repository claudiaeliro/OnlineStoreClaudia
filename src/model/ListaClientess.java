package model;

import java.util.ArrayList;

public class ListaClientess extends Lista<Cliente>
{
    @Override
    public ArrayList<Cliente> getArrayList() {
        return super.getArrayList();
    }
    public  void setLista(ArrayList<Cliente> lista)
    {
        super.lista=lista;
    }
}
