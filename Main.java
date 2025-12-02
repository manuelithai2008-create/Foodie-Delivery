public class Main {
    
    public static void main(String[] args) {
        
        Gestorpedidos gestor = new Gestorpedidos();

        
        platoComida plato1 = new platoComida("P053", "Ensalada", 20.5, true);
        platoComida plato2 = new platoComida("P2008", "Pollo a la BBQ", 10.0, false);
        Bebida bebida1 = new Bebida("B1234", "Jugo de Mandarina", 4.5, 300);
        Bebida bebida2 = new Bebida("B002", "Coca Cola", 5.0, 350);

        
        gestor.agregarItem(plato1);
        gestor.agregarItem(plato2);
        gestor.agregarItem(bebida1);
        gestor.agregarItem(bebida2);

        
        System.out.println("\n Pedido Final ");
        for (ItemMenu item : gestor.getPedidoActual()) {
            System.out.println(item.obtenerDetalles()); 
        }

        
        System.out.println("\nPrecio Total: $" + gestor.calcularTotal());
    }
}


