package model;
import java.util.ArrayList;

public class ListaClientes {
    private ArrayList<Cliente> clientes;

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ListaClientes() {
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }
    public void setClientes(Cliente cliente)
    {
        clientes.add(cliente);
    }

    public boolean comprobarCliente(String nif)
    {
        for(Cliente cliente: this.getClientes())
        {
            if (cliente.getNif().equals(nif))
            {
                return true;
            }
        }
        return false;
    }
    public void borrarCliente(String nif)
    {
        this.getClientes().removeIf(p->p.getNif().equals(nif));
    }

}
