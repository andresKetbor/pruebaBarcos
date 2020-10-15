import java.util.*;

public class Main {


    public static void main(String args[]){

      Cliente cli = new Cliente("juan","perez");

      Articulo papa = new Articulo();

      papa.setDescripcion("papas");
      papa.setIdArticulo(1);
      papa.setPrecio(35.8F);

      Articulo zanahoria = new Articulo();

      zanahoria.setIdArticulo(2);
      zanahoria.setDescripcion("zanahoraia");
      zanahoria.setPrecio(53.8F);

      FacturaItem item = new FacturaItem();
      FacturaItem item2 = new FacturaItem();


      item.setArticulo(papa);
      item.setCantidad((short) 2);
      item.setIdItem(3);

      Factura factura = new Factura();

      factura.addItem(item);

      item.setCantidad((short) 4);

      item2.setArticulo(zanahoria);
      item2.setCantidad((short) 3);
      item2.setIdItem(4);


      factura.addItem(item2);

      factura.calcularFactura();



    }
}
