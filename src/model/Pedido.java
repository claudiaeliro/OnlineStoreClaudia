package model;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Pedido {

    private Integer numeroPedido;
    private Cliente cliente;
    private Articulo articulo;
    private Integer unidades;
    private LocalTime fechaHora;

   /* public Pedido(Integer numeroPedido, Cliente cliente, Articulo articulo, Integer unidades, LocalTime fechaHora) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.unidades = unidades;
        this.fechaHora = fechaHora;
    }*/

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public LocalTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", cliente=" + cliente.toString() +
                ", articulo=" + articulo.toString() +
                ", unidades=" + unidades +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
