import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // O1ejemplo o1 = new O1ejemplo();
        // System.out.println(o1.array[2]);

        // O2ejemplo o2 = new O2ejemplo();
        // o2.imprimir();

        // O3ejemplo o3 = new O3ejemplo();
        // o3.o3imprimir();
        

        // int[] datos = {10, 20, 30, 40, 50}; 
        // LongEjempllo obj = new LongEjempllo();
        // int resultado = obj.busquedaBinaria(datos, 30);
        // if (resultado != -1) {
        //     System.out.println("Elemento encontrado en la posición: " + resultado);
        // } else {
        //     System.out.println("Elemento no encontrado");
        // }

        int[] datos = {50, 20, 40, 10, 30};

        O4Ejemplo obj = new O4Ejemplo();

        obj.ordenar(datos);

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(datos));

    }
}
