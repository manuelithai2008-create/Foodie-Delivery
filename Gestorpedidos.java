import java.util.ArrayList;

public class Gestorpedidos { 

    private ArrayList<ItemMenu> pedidoActual = new ArrayList<>(); 

    public void agregarItem(ItemMenu item) { 
        pedidoActual.add(item); 
    }

    public ArrayList<ItemMenu> getPedidoActual() { 
        return pedidoActual; 
    }

    public double calcularTotal() { 
        double total = 0.0; 
        for (ItemMenu item : pedidoActual) { 
            total += item.getprecio();
        }
        return total; 
    }
}


