public class Descuento{
    private double precio;
    public Descuento(double precio){
        if (precio < 0) {
        throw new IllegalArgumentException("El precio no puede ser negativo");
      }
        this.precio = precio
    }
    public double aplicarDescuento(){
        return precio * 0.90; 
    }
}