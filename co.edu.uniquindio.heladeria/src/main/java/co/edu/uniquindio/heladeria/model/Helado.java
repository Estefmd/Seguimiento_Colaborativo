package co.edu.uniquindio.heladeria.model;
import co.edu.uniquindio.heladeria.enumeracion.Sabor;
import co.edu.uniquindio.heladeria.enumeracion.TipoCono;
import co.edu.uniquindio.heladeria.enumeracion.AdicionalTopping;

public class Helado {
    private Sabor sabor;
    private TipoCono tipoCono;
    private AdicionalTopping adicionalTopping;
    private int cantidadBolas;
    private int stockAlmacen;
    private double precioTotal;

    public Helado(Sabor sabor, TipoCono tipoCono, AdicionalTopping adicionalTopping, int cantidadBolas, int stockAlmacen, double precioTotal) {
        this.sabor = sabor;
        this.tipoCono = tipoCono;
        this.adicionalTopping = adicionalTopping;
        this.cantidadBolas = cantidadBolas;
        this.stockAlmacen = stockAlmacen;
        this.precioTotal = precioTotal;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public TipoCono getTipoCono() {
        return tipoCono;
    }

    public void setTipoCono(TipoCono tipoCono) {
        this.tipoCono = tipoCono;
    }

    public AdicionalTopping getAdicionalTopping() {
        return adicionalTopping;
    }

    public void setAdicionalTopping(AdicionalTopping adicionalTopping) {
        this.adicionalTopping = adicionalTopping;
    }

    public int getCantidadBolas() {
        return cantidadBolas;
    }

    public void setCantidadBolas(int cantidadBolas) {
        this.cantidadBolas = cantidadBolas;
    }

    public int getStockAlmacen() {
        return stockAlmacen;
    }

    public void setStockAlmacen(int stockAlmacen) {
        this.stockAlmacen = stockAlmacen;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
