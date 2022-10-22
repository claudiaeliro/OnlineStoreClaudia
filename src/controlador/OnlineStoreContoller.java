package controlador;

import view.*;
import model.*;

import java.time.LocalTime;

public class OnlineStoreContoller {
    private ListaArticulos modelListaArticulos;
    private ListaPedidos modelListaPedidos;
    private ListaClientes modelListaClientes;
    private Articulo modelArticulo;
    private ClienteEstandard  modelClienteEstandar;
    private ClientePremium modelClientePremium;
    private Pedido modelPedido;
    private OnlineStoreView view;

    public OnlineStoreContoller(ListaArticulos modelListaArticulos, ListaPedidos modelListaPedidos,  ListaClientes modelListaClientes, Articulo modelArticulo, ClienteEstandard modelClienteEstandar, ClientePremium modelClientePremium, Pedido modelPedido, OnlineStoreView view) {
        this.modelListaArticulos =modelListaArticulos;
        this.modelListaPedidos=modelListaPedidos;
        this.modelListaClientes=modelListaClientes;
        this.modelArticulo = modelArticulo;
        this.modelClienteEstandar = modelClienteEstandar;
        this.modelClientePremium = modelClientePremium;
        this.modelPedido = modelPedido;
        this.view = view;
    }

    /*public void setArticuloCodigo(String codigo)
    {
        modelArticulo.setCodigo(codigo);
    }
    public String getArticuloCodigo()
    {
        return modelArticulo.getCodigo();
    }

    public void setArticuloDescripcion(String descripcion)
    {
        modelArticulo.setDescripcion(descripcion);
    }
    public String getArticuloDescripcion()
    {
        return modelArticulo.getDescripcion();
    }

    public void setArticulopvpVenta(float precio)
    {
        modelArticulo.setPvpVenta(precio);
    }
    public float getArticulopvpVenta()
    {
        return modelArticulo.getPvpVenta();
    }
    public  void setArticuloGastosEnvio(float gastos)
    {
        modelArticulo.setGastosEnvio(gastos);
    }
    public float getArticuloGastosEnvio()
    {
        return modelArticulo.getGastosEnvio();
    }

    public void setArticuloTiempoPreparacion(int tiempo)
    {
        modelArticulo.setTiempoPreparacion(tiempo);;
    }
    public int getArticuloTiempoPreparacion()
    {
        return modelArticulo.getTiempoPreparacion();
    }

    public void setClienteEstardardEmail(String email)
    {
        modelClienteEstandar.seteMail(email);
    }
    public String getClienteEstardardEmail()
    {
        return modelClienteEstandar.geteMail();
    }
    public void setClienteEstandardNombre(String nombre)
    {
        modelClienteEstandar.setNombre(nombre);
    }
    public String getClienteEstandardNombre()
    {
        return modelClienteEstandar.getNombre();
    }
    public void setClienteEstandardDomicilio(String domicilio)
    {
        modelClienteEstandar.setDomicilio(domicilio);
    }
    public String getClienteEstandardDomicilio()
    {
        return modelClienteEstandar.getDomicilio();
    }
    public void setClienteEstandardNif(String nif)
    {
        modelClienteEstandar.setNif(nif);
    }
    public String getClineteEstandardNif()
    {
        return modelClienteEstandar.getNif();
    }

    public void setClientePremiumEmail(String email)
    {
        modelClientePremium.seteMail(email);
    }
    public String getClientePremium()
    {
        return modelClientePremium.geteMail();
    }
    public void setClientePremiumNombre(String nombre)
    {
        modelClientePremium.setNombre(nombre);
    }
    public String  getClientePremiumNombre()
    {
        return modelClientePremium.getNombre();
    }
    public void setClientePremiumDomicilio(String domicilio)
    {
        modelClientePremium.setDomicilio(domicilio);
    }
    public String getClientePremiumDomicilio()
    {
        return modelClientePremium.getDomicilio();
    }
    public void setClientePremiumNif(String nif)
    {
        modelClientePremium.setNif(nif);
    }
    public String getClientePremiumNif()
    {
        return modelClientePremium.getNif();
    }
    public void setClientePremiumCuotaAnual(float cuotaAnual)
    {
        modelClientePremium.setCuotaAnual(cuotaAnual);
    }
    public float getClientePremiumCuatoAnual()
    {
        return modelClientePremium.getCuotaAnual() ;
    }
    public void setClientePremiumDescuento(float descuento)
    {
        modelClientePremium.setDescuento(descuento);
    }
    public float getClientePremiumDescuento()
    {
        return modelClientePremium.getDescuento();
    }

    public void setPedidoNumeroPedido(Integer numeroPedido)
    {
        modelPedido.setNumeroPedido(numeroPedido);
    }
    public Integer getPedidoNumeroPedido()
    {
        return modelPedido.getNumeroPedido();
    }
    public void setClientePedido(Cliente cliente)
    {
        modelPedido.setCliente(cliente);
    }
    public Cliente getClientePeido()
    {
        return modelPedido.getCliente();
    }
    public void setArticuloPedido(Articulo articulo)
    {
        modelPedido.setArticulo(articulo);
    }
    public Articulo getArticuloPedido()
    {
        return modelPedido.getArticulo();
    }
    public void setUnidadesPedido(Integer unidades)
    {
        modelPedido.setUnidades(unidades);
    }
    public Integer getUnidadesPedido()
    {
        return modelPedido.getUnidades();
    }

    public void setFechaHoraPedido(LocalTime fechaHora)
    {
        modelPedido.setFechaHora(fechaHora);
    }
    public LocalTime getFechaHoraPedido()
    {
        return modelPedido.getFechaHora();
    }
*/
    public void menuInicio () {
    char resultado;
    boolean salir=false;
        do
        {
            resultado=view.inicio();
            switch (resultado)
            {
                case '1':
                    añadirClienteEstandard();
                    break;
                case '2':
                    añadirClientePremium();
                    break;
                case '3':
                    darBajaCliente();
                    break;
                case '4':
                    listarTodosClientes();
                    break;
                case '5':
                    añadirArticulo();
                case '6':
                    break;
                case '7':
                    listarTodosArticulos();
                    break;
            }

            if (resultado=='0') salir=true ;
        }while (!salir);

    }

    private void añadirArticulo()
    {
        modelArticulo=new Articulo();
        modelArticulo.setCodigo(view.codigoArticulo());
        modelArticulo.setDescripcion(view.descripcionArticulo());
        modelArticulo.setPvpVenta(view.pvpVentaArticulo());
        modelArticulo.setGastosEnvio(view.gastosEnvioArticulo());
        modelArticulo.setTiempoPreparacion(view.tiempoPreparacionArticulo());
        modelArticulo.setNumeroArticulos(view.numeroArticulos());

        if (modelListaArticulos.comprobarArticulo(modelArticulo.getCodigo())==true)
        {
            view.articuloRepetido(modelArticulo.getCodigo());
            return;
        }
        modelListaArticulos.setArticulos(modelArticulo);

    }


    private void añadirClienteEstandard()
    {
        modelClienteEstandar= new ClienteEstandard();
        modelClienteEstandar.setNif(view.nifClinete());
        modelClienteEstandar.setDomicilio(view.domicilioCiente());
        modelClienteEstandar.setNombre(view.nombreCliente());;
        modelClienteEstandar.seteMail(view.eMailCliente());
        if (modelListaClientes.comprobarCliente(modelClienteEstandar.getNif())==true)
        {
            view.clienteRepetido(modelClienteEstandar.getNif() );
            return;
        }
        modelListaClientes.setClientes(modelClienteEstandar);


    }
    private void añadirClientePremium()
    {
        modelClientePremium = new ClientePremium();
        modelClientePremium.setNif(view.nifClinete());
        modelClientePremium.setDomicilio((view.domicilioCiente()));
        modelClientePremium.setNombre(view.nombreCliente());
        modelClientePremium.seteMail(view.eMailCliente());
        modelClientePremium.setDescuento(view.descuentoClientePremium());
        modelClientePremium.setCuotaAnual(view.cuotaAnualClientePremium());

        if (modelListaClientes.comprobarCliente(modelClientePremium.getNif())==true)
        {
            view.clienteRepetido(modelClientePremium.getNif() );
            return;
        }
        modelListaClientes.setClientes(modelClientePremium);

    }
    private void listarTodosArticulos()
    {
        for (Articulo articulo: modelListaArticulos.getArticulos())
        {
            view.mostrarArticulos(articulo.getCodigo(),articulo.getDescripcion(),articulo.getPvpVenta(),articulo.getGastosEnvio(),articulo.getTiempoPreparacion(),articulo.getNumeroArticulos());
        }
    }

    private void listarTodosClientes()
    {
        for (Cliente cliente: modelListaClientes.getClientes())
        {
            if (cliente instanceof ClienteEstandard)
            {
                view.mostrarClienteEstandard(cliente.getNombre(),cliente.getNif() ,cliente.getDomicilio(),cliente.geteMail());
            }
            else if (cliente instanceof ClientePremium)
            {
                view.mostrarClientePremium(cliente.getNombre(),cliente.getNif(),cliente.getDomicilio(),cliente.geteMail(), ((ClientePremium) cliente).getDescuento() , ((ClientePremium) cliente).getCuotaAnual() );
            }

        }
    }

    private void darBajaCliente()
    {
        String nif=view.nifClienteBaja();
        if (modelListaClientes.comprobarCliente(nif)==true)
        {
            modelListaClientes.borrarCliente(nif);
        }
        else view.clienteNoBorrar(nif);

    }
}
