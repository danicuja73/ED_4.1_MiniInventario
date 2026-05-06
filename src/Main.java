public class Main {

    public static void main(String[] args) {

        String[] productos = {"Teclado", "Ratón", "Monitor"};
        String busqueda = "Ratón";
        boolean encontrado = false;

        for (String producto : productos) {
            if (producto.equalsIgnoreCase(busqueda)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Producto encontrado: " + busqueda);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}