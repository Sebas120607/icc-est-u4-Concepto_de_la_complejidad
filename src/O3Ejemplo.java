public class O3Ejemplo {
    public int[] array = {10, 20, 30, 40, 50};

    public void o3imprimir() {
       for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }

}
