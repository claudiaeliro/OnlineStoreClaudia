package view;

import java.util.Scanner;

public class OnlineStoreView2 {

    Scanner teclado = new Scanner(System.in);
    public char inicio() {

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

        return opcion;
    }


    public void listarArticulos(String articulo)
    {
        System.out.println("Listado de todos los artículos de la tienda: ");
        System.out.println(articulo);
        System.out.println("----------------------------------------------");
    }

    public String nifClienteBaja()
    {
        String nif;
        System.out.println("Escribe el nif del Cliente que quieres dar de baja: ");
        nif=teclado.nextLine();
        return nif;
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

    public void articuloRepetidos(String codigo)
    {
        System.out.println("El Artículo con el código: " + codigo +" ya está dado de alta.");

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


}
