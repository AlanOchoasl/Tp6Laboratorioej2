
package tp6laboratorioej2;

public class Producto implements Comparable<Producto>{

    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Rubro rubro;
    
    public Producto (){
        
    }
    
    public Producto (int codigo, String descripcion, double precio, int stock, Rubro rubro){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }
    
    public int getCodigo (){return codigo;}
    public String getDescripcion (){return descripcion;}
    public double getPrecio (){return precio;}
    public int getStock (){return stock;}
    public Rubro getRubro (){return rubro;}
    
    public void setCodigo (int codigo){this.codigo = codigo;}
    public void setDescripcion (String descripcion){this.descripcion = descripcion;}
    public void setPrecio (double precio){this.precio = precio;}
    public void setStock (int stock){this.stock = stock;}
    public void setRubro (Rubro rubro){this.rubro = rubro;}
    
    @Override
    public int compareTo(Producto otro){
        return Integer.compare(this.codigo, otro.codigo);
    }
    
    @Override
    public String toString (){
        return "Codigo " + codigo + "\nDescripcion: " + descripcion + "\nPrecio: " + precio + "\nStock: " + stock + "\nRubro: " + rubro;
    }
}
