package co.edu.uniquindio.heladeria;
import co.edu.uniquindio.heladeria.model.Cliente;
import co.edu.uniquindio.heladeria.model.Helado;
import co.edu.uniquindio.heladeria.enumeracion.Sabor;
import co.edu.uniquindio.heladeria.enumeracion.TipoCono;
import co.edu.uniquindio.heladeria.enumeracion.AdicionalTopping;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = crearCliente("Juan", "Morales", 43098765, 36, "16 agosto 2023");
        Cliente cliente2 = crearCliente("Valentina", "Naranjo", 10100896, 17, "10 septiembre 2023");
        Cliente cliente3 = crearCliente("Estefania", "Montoya", 1096037, 29, "10 septiembre 2023");
        Cliente cliente4 = crearCliente("Luis Felipe", "Perez", 1094907, 30, "30 septiembre 2023");

        Helado helado1 = crearHelado(Sabor.QUESO_CON_BOCADILLO, TipoCono.AZUCAR, AdicionalTopping.CHIPS_CHOCOLATE, 2, 100, 8000);
        Helado helado2 = crearHelado(Sabor.CHOCOLATE, TipoCono.GALLETA, AdicionalTopping.CHIPS_COLORES, 1, 200, 8900);
        Helado helado3 = crearHelado(Sabor.VAINILLA_CHIPS, TipoCono.GALLETA, AdicionalTopping.CREMA_CHANTILLY, 2, 283, 9900);
        Helado helado4 = crearHelado(Sabor.MARACUYA, TipoCono.AZUCAR, AdicionalTopping.TROZOS_CHOCORRAMO, 2, 189, 13450);

        clienteMAyorEdad(cliente1, cliente2, cliente3, cliente4);
        Helado heladoMayorCosto = heladoMayorCosto(helado1, helado2, helado3, helado4);
        System.out.println("El helado de mayor costo es de: " + heladoMayorCosto.getSabor() + " y tiene un costo de: " + heladoMayorCosto.getPrecioTotal()+"\n");

        int heladosBolas2 = heladosBolas2(helado1,helado2,helado3,helado4);
        System.out.println("La cantidad de helados con dos bolas es: " +heladosBolas2+"\n");

        String clientesFecha = clientesFechaEspecifico(cliente1,cliente2,cliente3,cliente4,"10 septiembre 2023");
        System.out.println(clientesFecha+"\n");

        int topping = toppingHelado(helado1,helado2,helado3,helado4,AdicionalTopping.CHIPS_COLORES);
        System.out.println("La cantidad de helados con Topping de: " +AdicionalTopping.CHIPS_COLORES+ " son: " +topping+"\n");


        System.out.println("Informacion de los helados: ");
        helado1.mostrarInformacion();
        helado2.mostrarInformacion();
        helado3.mostrarInformacion();
        helado4.mostrarInformacion();

        int stockMayor200 = stockAlmacenamiento(helado1, helado2, helado3,helado4);
        System.out.println("La cantidad de helados con stock mayor a 200 unidades es: "+stockMayor200);
    }

    public static void clienteMAyorEdad(Cliente cliente1, Cliente cliente2, Cliente cliente3, Cliente cliente4) {
        String mensaje = "";
        int edadMayor = 0;
        Cliente clienteMayor = cliente1;

        if (cliente1.getEdad() > edadMayor) {
            clienteMayor = cliente1;
            edadMayor = cliente1.getEdad();
        }
        if (cliente2.getEdad() > edadMayor) {
            clienteMayor = cliente2;
            edadMayor = cliente2.getEdad();
        }
        if (cliente3.getEdad() > edadMayor) {
            clienteMayor = cliente3;
            edadMayor = cliente3.getEdad();
        }
        if (cliente4.getEdad() > edadMayor) {
            clienteMayor = cliente4;
            edadMayor = cliente4.getEdad();
        }
        System.out.println("El cliente de mayor edad que compra en la heladería es: " + clienteMayor.getNombre() + " y tiene " + clienteMayor.getEdad() + " años \n");
    }

    public static Helado heladoMayorCosto(Helado helado1, Helado helado2, Helado helado3, Helado helado4) {
        Helado heladoMayorCosto = helado1;
        double mayorPrecio = 0;

        if (helado1.getPrecioTotal() > mayorPrecio) {
            heladoMayorCosto = helado1;
        }
        if (helado2.getPrecioTotal() > mayorPrecio) {
            heladoMayorCosto = helado2;
        }
        if (helado3.getPrecioTotal() > mayorPrecio) {
            heladoMayorCosto = helado3;
        }
        if (helado4.getPrecioTotal() > mayorPrecio) {
            heladoMayorCosto = helado4;
        }

        return heladoMayorCosto;
    }

    public static String clientesFechaEspecifico(Cliente cliente1, Cliente cliente2, Cliente cliente3, Cliente cliente4, String fecha) {
        int clientesFecha = 0;
        if (cliente1.getFechaCompra().equalsIgnoreCase(fecha)){
            clientesFecha++;
        }
        if (cliente2.getFechaCompra().equalsIgnoreCase(fecha)){
            clientesFecha++;
        }
        if (cliente3.getFechaCompra().equalsIgnoreCase(fecha)){
            clientesFecha++;
        }
        if (cliente4.getFechaCompra().equalsIgnoreCase(fecha)){
            clientesFecha++;
        }

        String mensaje = "La cantidad de clientes que compraron el "+fecha+" es de "+clientesFecha+" clientes \n";
        return mensaje;
    }
    public static int heladosBolas2(Helado helado1, Helado helado2, Helado helado3, Helado helado4){
        int cantidadHelados = 0;

        if (helado1.getCantidadBolas() == 2){
            cantidadHelados++;
        }
        if (helado2.getCantidadBolas() == 2){
            cantidadHelados++;
        }
        if (helado3.getCantidadBolas() == 2){
            cantidadHelados++;
        }
        if (helado4.getCantidadBolas() == 2){
            cantidadHelados++;
        }
        return cantidadHelados;
    }
    public static int toppingHelado(Helado helado1, Helado helado2, Helado helado3, Helado helado4,AdicionalTopping adicionalTopping){
        int heladosAdicionalTopping = 0;

        if (helado1.getAdicionalTopping() == adicionalTopping){
            heladosAdicionalTopping++;
        }
        if (helado2.getAdicionalTopping() == adicionalTopping){
            heladosAdicionalTopping++;
        }
        if (helado3.getAdicionalTopping() == adicionalTopping){
            heladosAdicionalTopping++;
        }
        if (helado4.getAdicionalTopping() == adicionalTopping){
            heladosAdicionalTopping++;
        }
        return heladosAdicionalTopping;
    }
    public static int stockAlmacenamiento(Helado helado1, Helado helado2, Helado helado3, Helado helado4){
        int stockHelados = 0;

        if (helado1.getStockAlmacen() > 200) {
            stockHelados++;
        }
        if (helado2.getStockAlmacen() > 200) {
            stockHelados++;
        }
        if (helado3.getStockAlmacen() > 200) {
            stockHelados++;
        }
        if (helado4.getStockAlmacen() > 200) {
            stockHelados++;
        }
        return stockHelados;
    }



    public static Helado crearHelado(Sabor sabor, TipoCono tipoCono, AdicionalTopping adicionalTopping, int cantidadBolas, int stockAlmacen, double precioTotal){
        Helado helado = new Helado(sabor,tipoCono, adicionalTopping,cantidadBolas,stockAlmacen,precioTotal);
        return helado;
    }
    public static Cliente crearCliente (String nombre, String apellido, int documento, int edad, String fechaCompra){
        Cliente cliente = new Cliente(nombre,apellido,documento,edad,fechaCompra);
        return cliente;
    }


}
