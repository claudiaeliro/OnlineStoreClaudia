package model;

import java.util.ArrayList;

public class ListaArticulos {

    private ArrayList<Articulo> articulos;

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public ListaArticulos() {
        this.articulos = new ArrayList<>();
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo articulo) {
        articulos.add(articulo);
    }

    public boolean comprobarArticulo(String codigo) {
        for (Articulo articulo : this.getArticulos()) {
            if (articulo.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

}
