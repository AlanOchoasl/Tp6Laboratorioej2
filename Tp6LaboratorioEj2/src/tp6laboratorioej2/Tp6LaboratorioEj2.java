
package tp6laboratorioej2;

import GUI.Pantalla;

public class Tp6LaboratorioEj2 {

    public static void main(String[] args) {
        
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        GestionProductos gestion = new GestionProductos ();
        
        Producto producto1 = new Producto (100, "Arroz", 1500, 20, Rubro.COMESTIBLE);
        Producto producto2 = new Producto (200, "Detergente", 2300, 15, Rubro.LIMPIEZA);
        Producto producto3 = new Producto (300, "Perfume", 3500, 10, Rubro.PERFUMERIA);
        
        gestion.agregarProducto(producto1);
        gestion.agregarProducto(producto2);
        gestion.agregarProducto(producto3);
        
        System.out.println("PRODUCTOS: ");
        
        for (Producto producto : gestion.getProductos()) {
            System.out.println(producto);
        }
        
        System.out.println("\nBuscar por codigo");
        Producto encontrado = gestion.buscarPorCodigo(200);
        System.out.println(encontrado);
        
        System.out.println("\nBuscar por nombre");
        for (Producto producto : gestion.buscarPorNombre("Arroz")) {
            System.out.println(producto);
        }
        
        System.out.println("\nBuscar por precio");
        for (Producto producto : gestion.buscarPorPrecio(3500)) {
            System.out.println(producto);
        }
        
        System.out.println("\nBuscar por rubro");
        for (Producto producto : gestion.buscarPorRubro(Rubro.PERFUMERIA)) {
            System.out.println(producto);
        }
        
        System.out.println("\nModificar producto");
        gestion.modificarProducto(200, "Perfume Paco", 2500, 25, Rubro.PERFUMERIA);
        
        for (Producto producto : gestion.getProductos()) {
            System.out.println(producto);
        }
        
        System.out.println("\nEliminar producto");
        gestion.eliminarProducto(300);
        
        for (Producto producto : gestion.getProductos()) {
            System.out.println(producto);
        }
        
    }

}
