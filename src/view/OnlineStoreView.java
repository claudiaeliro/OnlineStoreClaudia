package view;

import java.util.Scanner;

public class OnlineStoreView {

    Scanner teclado = new Scanner(System.in);

    public char inicio() {
    /*    boolean salir = false ; */
        char opcion;
        /*do {*/
            System.out.println("-------------------------------------");
            System.out.println("1. Alta Clientes Estandard.");
            System.out.println("2. Alta Clientes Premium. ");
            System.out.println("3. Dar de Baja un Cliente. ");
            System.out.println("4. Listar Clientes. ");
            System.out.println("5. Alta Artículo. ");
            System.out.println("6. Baja Artículo. ");
            System.out.println("7. Listar Artículos. ");

            System.out.println("0. Salir");
            System.out.println("-------------------------------------");
            opcion = pedirOpcion();
            /*switch (opcio) {
                case '1':
                    // TO-BE-DONE
                    break;
                case '2':
                    // TO-BE-DONE
                    break;
                case '3':
                    // TO-BE-DONE
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir); */
        return opcion;
    }

    private char pedirOpcion() {
        String resp;
        System.out.println("Elige una opción (1,2,3,4,5,6,7 o 0):");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }
    public String nombreCliente()
    {
        String nombre;
        System.out.println("Escribe el nombre del cliente: ");
        nombre=teclado.nextLine();
        return nombre;
    }
    public String eMailCliente()
    {
        String email;
        System.out.println("Escribe el eMail del Cliente: ");
        email=teclado.nextLine();
        return email;
    }
    public String domicilioCiente()
    {
        String domicilio;
        System.out.println("Escribe domicilio del Cliente: ");
        domicilio=teclado.nextLine();
        return domicilio;
    }
    public String nifClinete()
    {
        String nif;
        System.out.println("Escribe nif del Cliente: ");
        nif= teclado.nextLine();
        return nif;
    }

    public String nifClienteBaja()
    {
        String nif;
        System.out.println("Escribe el nif del Cliente que quieres dar de baja: ");
        nif=teclado.nextLine();
        return nif;
    }

    public int cuotaAnualClientePremium()
    {
        int cuota;
        System.out.println("Cuata anual: ");
        cuota=teclado.nextInt();
        teclado = new Scanner(System.in);
        return cuota;
    }
    public int descuentoClientePremium()
    {
        int descuento;
        System.out.println("Descuento: ");
        descuento=teclado.nextInt();
        teclado = new Scanner(System.in);
        return descuento;
    }



    public void mostrarArticulos(String codigo, String descripcio, float pvpVenta, float gastosEnvio, int tiempoPreparacion, int numeroArticulos)
    {
        System.out.println("-------------------------------------");
        System.out.println("Artículos tienda....");
        System.out.println("Código Artículo: " + codigo);
        System.out.println("Descripción Artículo: " + descripcio);
        System.out.println("PVP Artículo: " + pvpVenta);
        System.out.println("Gastos envío Artículo: " + gastosEnvio);
        System.out.println("Tiempo preparación Artículo: " + tiempoPreparacion);
        System.out.println("Mumero Artículos: " + numeroArticulos);
        System.out.println("-------------------------------------");

    }

    public void mostrarClienteEstandard(String nombre, String nie,String direccion, String email)
    {
        System.out.println("-------------------------------------");
        System.out.println("Cliente Estandard....");
        System.out.println("Nombre Cliente: " + nombre);
        System.out.println("Nie Cliente: " + nie);
        System.out.println("Direccion Cliente: " + direccion);
        System.out.println("Email Cliente: " + email);
        System.out.println("-------------------------------------");

    }
    public void mostrarClientePremium(String nombre, String nie,String direccion, String email, float descuento, float cuota)
    {
        System.out.println("-------------------------------------");
        System.out.println("Cliente Premium....");
        System.out.println("Nombre Cliente: " + nombre);
        System.out.println("Nie Cliente: " + nie);
        System.out.println("Direccion Cliente: " + direccion);
        System.out.println("Email Cliente: " + email);
        System.out.println("Email descuento: " +  Float.toString(descuento)) ;
        System.out.println("Email cueta: " +   Float.toString(cuota) );
        System.out.println("-------------------------------------");

    }

    public void clienteRepetido(String nif)
    {
        System.out.println("El cliente con el NIF: " + nif +" ya está dado de alta.");

    }
    public void clienteNoBorrar(String nif)
    {
        System.out.println("No se puede borrar el Cliente con el NIF: " + nif + " porque no está dado de alta");
    }

    public String codigoArticulo()
    {
        String codigo;
        System.out.println("Escribe código del Articulo :");
        codigo= teclado.nextLine();
        return codigo;
    }
    public String descripcionArticulo()
    {
        String descripcion;
        System.out.println("Escribe la descripción del Artículo: ");
        descripcion= teclado.nextLine();
        return descripcion;
    }
    public float pvpVentaArticulo()
    {
        float pvp;
        System.out.println("Escribe el pvp del Artículo: ");
        pvp= teclado.nextFloat();
        teclado = new Scanner(System.in);
        return pvp;
    }
    public float gastosEnvioArticulo()
    {
        float gastosEnvio;
        System.out.println("Escribe los gastos de envío del Artículo: ");
        gastosEnvio=teclado.nextFloat();
        teclado= new Scanner(System.in);
        return gastosEnvio;
    }
    public int tiempoPreparacionArticulo()
    {
        int tiempoPreparacion;
        System.out.println("Escribe el tiempo de preparación del Artículo: ");
        tiempoPreparacion=teclado.nextInt();
        teclado= new Scanner(System.in);
        return tiempoPreparacion;
    }
    public int numeroArticulos()
    {
        int numeroArticulos;
        System.out.println("Escribe el número de Artículos que tienes: ");
        numeroArticulos= teclado.nextInt();
        teclado=new Scanner(System.in);
        return numeroArticulos;
    }

    public void articuloRepetido(String codigo)
    {
        System.out.println("El Artículo con el código: " + codigo +" ya está dado de alta.");

    }






}
