package model;

public class Articulo {
    private String codigo;
    private String descripcion;
    private float pvpVenta;
    private float gastosEnvio;
    private int tiempoPreparacion;
    private int numeroArticulos;

   /* public Articulo(String codigo, String descripcion, float pvpVenta, float gastosEnvio, int tiempoPreparacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pvpVenta = pvpVenta;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPreparacion = tiempoPreparacion;
    }*/

    public int getNumeroArticulos()
    {
        return numeroArticulos;
    }
    public void setNumeroArticulos(int numeroArticulos)
    {
        this.numeroArticulos=numeroArticulos;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPvpVenta() {
        return pvpVenta;
    }

    public void setPvpVenta(float pvpVenta) {
        this.pvpVenta = pvpVenta;
    }

    public float getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", pvpVenta=" + pvpVenta +
                ", gastosEnvio=" + gastosEnvio +
                ", tiempoPreparacion=" + tiempoPreparacion +
                '}';
    }
}
