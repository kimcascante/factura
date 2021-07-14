public class factura{
    public static void main (String[] args) {
        
        double precio;
                double descuento;
                double impuestos;
                double total;
                
                
     System.out.println("Digite el costo del producto");
     precio = Double.parseDouble(System.console().readLine());
                        
     System.out.println("Digite el descuento del producto");
     descuento = Double.parseDouble(System.console().readLine());
     
     System.out.println("Digite el impuesto de ventas");
     impuestos = Double.parseDouble(System.console().readLine());
     
     descuento = (descuento / 100) * precio;
     System.out.println("El descuento es de: " + descuento);
     
     total = precio - descuento;
     System.out.println("Su total sin impuestos es: " + total);
     
     impuestos = (impuestos / 100) * total;
     System.out.println("Los impuestos son: " + impuestos);
     
     total = total + impuestos;
     System.out.println("Subtotal es: " + total);
    }
}