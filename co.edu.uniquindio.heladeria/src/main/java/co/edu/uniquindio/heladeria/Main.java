package co.edu.uniquindio.heladeria;
import co.edu.uniquindio.heladeria.model.Cliente;
import co.edu.uniquindio.heladeria.model.Helado;
import co.edu.uniquindio.heladeria.enumeracion.Sabor;
import co.edu.uniquindio.heladeria.enumeracion.TipoCono;
import co.edu.uniquindio.heladeria.enumeracion.AdicionalTopping;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = crearCliente("Juan","Morales",43098765,36,"16 agosto 2023");
        Cliente cliente2 = crearCliente("Valentina","Naranjo",10100896,17,"10 septiembre 2023");
        Cliente cliente3 = crearCliente("Estefania","Montoya",1096037,29,"10 septiembre 2023");
        Cliente cliente4 = crearCliente("Luis Felipe","Perez",1094907,30,"30 septiembre 2023");

        Helado helado1 = crearHelado(Sabor.QUESO_CON_BOCADILLO, TipoCono.AZUCAR,AdicionalTopping.CHIPS_CHOCOLATE,2,100, 8000);
        Helado helado2 = crearHelado(Sabor.CHOCOLATE,TipoCono.GALLETA,AdicionalTopping.CHIPS_COLORES,1,200,8900);
        Helado helado3 = crearHelado(Sabor.VAINILLA_CHIPS,TipoCono.GALLETA,AdicionalTopping.CREMA_CHANTILLY,2,283,9900);
        Helado helado4 = crearHelado(Sabor.MARACUYA,TipoCono.AZUCAR,AdicionalTopping.TROZOS_CHOCORRAMO,2,189,13450);

        clienteMAyorEdad(cliente1,cliente2,cliente3,cliente4);
        Helado heladoMayorCosto = heladoMayorCosto(helado1,helado2,helado3,helado4);
        System.out.println("El helado de mayor costo es de: "+heladoMayorCosto.getSabor()+" y tiene un costo de: "+heladoMayorCosto.getPrecioTotal());
    }

    public static void clienteMAyorEdad(Cliente cliente1,Cliente cliente2,Cliente cliente3,Cliente cliente4){
        String mensaje = "";
        int edadMayor = 0;
        Cliente clienteMayor = cliente1;

        if(cliente1.getEdad() > edadMayor){
            clienteMayor = cliente1;
            edadMayor = cliente1.getEdad();
        }
        if(cliente2.getEdad() > edadMayor){
            clienteMayor = cliente2;
            edadMayor = cliente2.getEdad();
        }
        if(cliente3.getEdad() > edadMayor){
            clienteMayor = cliente3;
            edadMayor = cliente3.getEdad();
        }
        if(cliente4.getEdad() > edadMayor){
            clienteMayor = cliente4;
            edadMayor = cliente4.getEdad();
        }
        System.out.println(" El cliente de mayor edad que compra en la heladería es: " + clienteMayor.getNombre()+ " y tiene " +clienteMayor.getEdad()+ " años ");
    }

    public static Helado heladoMayorCosto(Helado helado1, Helado helado2, Helado helado3, Helado helado4){
        Helado heladoMayorCosto = helado1;
        double mayorPrecio = 0;

        if (helado1.getPrecioTotal()>mayorPrecio){
            heladoMayorCosto = helado1;
        }
        if (helado2.getPrecioTotal()>mayorPrecio){
            heladoMayorCosto = helado2;
        }
        if (helado3.getPrecioTotal()>mayorPrecio){
            heladoMayorCosto = helado3;
        }
        if (helado4.getPrecioTotal()>mayorPrecio){
            heladoMayorCosto = helado4;
        }

        return heladoMayorCosto;
    }
    public static String clientesFechaEspecifico(Cliente cliente1, Cliente cliente2, Cliente cliente3, Cliente cliente4){

        return "";
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
