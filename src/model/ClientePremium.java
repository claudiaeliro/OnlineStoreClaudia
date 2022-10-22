package model;

public class ClientePremium extends Cliente {
    private float cuotaAnual;
    private float descuento;

    /*public ClientePremium(String eMail, String nombre, String domicilio, String nif, float cuotaAnual, float descuento) {
        super(eMail, nombre, domicilio, nif);
        this.cuotaAnual = cuotaAnual;
        this.descuento = descuento;
    }*/

    public float getCuotaAnual() {
        return cuotaAnual;
    }

    public void setCuotaAnual(float cuotaAnual) {
        this.cuotaAnual = cuotaAnual;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "ClientePremium{" +
                "nombre=" + super.getNombre() +
                "domicilio=" + super.getDomicilio() +
                "nif=" + super.getNif() +
                "email=" + super.geteMail() +
                "cuotaAnual=" + cuotaAnual +
                ", descuento=" + descuento +
                '}';
    }
}
