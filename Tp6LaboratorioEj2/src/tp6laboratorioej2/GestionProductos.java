
package tp6laboratorioej2;

import java.util.ArrayList;
import java.util.TreeSet;

public class GestionProductos {

    private TreeSet <Producto> productos;
    
    public GestionProductos (){
        
        productos = new TreeSet<>();
        
    }
    
    public boolean agregarProducto (Producto producto){
        return productos.add(producto);
    }
    
    public boolean eliminarProducto (int codigo){
        Producto producto = buscarPorCodigo(codigo);
        
        if (producto != null){
            return productos.remove(producto);
        }
        return false;
    }
    
    public boolean modificarProducto (int codigo, String descripcion, double precio, int stock, Rubro rubro){
        
        Producto producto = buscarPorCodigo(codigo);
        
        if (producto == null){
            return false;
        }
        
        productos.remove(producto);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setStock(stock);
        producto.setRubro(rubro);
        
        productos.add(producto);
        return true;
        
    }
    
    public Producto buscarPorCodigo (int codigo){
        
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo){
                return producto;
            }
        }
        
        return null;
        
    }
    
    public ArrayList<Producto> buscarPorNombre (String nombre) {
        
        ArrayList<Producto> resultados = new ArrayList<>();
        
        for (Producto producto : productos) {
            
            if (producto.getDescripcion().equalsIgnoreCase(nombre)){
                resultados.add(producto);
            }
            
        }
        return resultados;
    }
    
    public ArrayList<Producto> buscarPorPrecio (double precio){
        
        ArrayList<Producto> resultados = new ArrayList<>();
        
        for (Producto producto : resultados) {
            
            if (producto.getPrecio() == precio){
                resultados.add(producto);
            }
        }
        
        return resultados;
                
    }
    
    public ArrayList<Producto> buscarPorRubro (Rubro rubro){
        
        ArrayList <Producto> resultados = new ArrayList<>();
        
        for (Producto producto : productos) {
            
            if (producto.getRubro() == rubro){
                resultados.add(producto);
            }
        }
        
        return resultados;
        
    }
    
    public TreeSet<Producto> getProductos (){
        return productos;
    }
    
}
