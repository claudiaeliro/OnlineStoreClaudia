package controlador;
import view.*;
import model.*;

public class OnlineStoreController2 {
    private Datos modelDatos;
    private OnlineStoreView2 view;

    public OnlineStoreController2(Datos modelDatos, OnlineStoreView2 view) {
        this.modelDatos = modelDatos;
        this.view = view;
    }


    public void menuInicio2() {

        char resultado;
        boolean salir = false;
        do {
            resultado = view.inicio();
            switch (resultado) {
                case '1':
                    añadirClienteEstandard();
                    break;
                case '2':
                    //añadirClientePremium();
                    break;
                case '3':
                    //darBajaCliente();
                    break;
                case '4':
                    //listarTodosClientes();
                    break;
                case '5':
                    añadirArticulo();
                    break;
                case '6':
                    borrarArticulo();
                    break;
                case '7':
                    listarTodosArticulos();
                    break;
            }

            if (resultado == '0') salir = true;
        } while (!salir);
    }

    private void añadirClienteEstandard()
    {
        modelDatos.inicializoClienteEstandard();
        modelDatos.getClienteEstandard().setNif(view.nifClinete());
        modelDatos.getClienteEstandard().setDomicilio(view.domicilioCiente());
        modelDatos.getClienteEstandard().setNombre(view.nombreCliente());
        modelDatos.getClienteEstandard().seteMail(view.eMailCliente());

        modelDatos.AddListaClienteEstandard(modelDatos.getClienteEstandard());

    }


    private void borrarArticulo()
    {
        String id=view.codigoArticulo();
        int comprobar= modelDatos.comprobarArticulo(id);
        if (comprobar!=1)
        {
            modelDatos.borrarArticulo(comprobar);

        }

    }

    private void listarTodosArticulos()
    {
        for (Articulo articulo: modelDatos.getListaArticuloss())
        {
            view.listarArticulos(articulo.toString());
        }

    }


        private void añadirArticulo ()
        {
            modelDatos.inicializoArticulo();
            modelDatos.getArticulo().setCodigo(view.codigoArticulo());
            modelDatos.getArticulo().setDescripcion(view.descripcionArticulo());
            modelDatos.getArticulo().setPvpVenta(view.pvpVentaArticulo());
            modelDatos.getArticulo().setGastosEnvio(view.gastosEnvioArticulo());
            modelDatos.getArticulo().setTiempoPreparacion(view.tiempoPreparacionArticulo());
            modelDatos.getArticulo().setNumeroArticulos(view.numeroArticulos());
            if (modelDatos.comprobarArticulo(modelDatos.getArticulo().getCodigo())!=-1)
            {
                view.articuloRepetidos(modelDatos.getArticulo().getCodigo());
                return;
            }
            modelDatos.AddListaArticuloss(modelDatos.getArticulo());

        }


    }




