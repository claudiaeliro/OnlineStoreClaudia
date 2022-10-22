package model;

public abstract class Cliente {

    private String eMail;
    private String nombre;
    private String domicilio;
    private String nif;


    /*public Cliente(String eMail, String nombre, String domicilio, String nif) {
        this.eMail = eMail;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
    }*/

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "eMail='" + eMail + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
