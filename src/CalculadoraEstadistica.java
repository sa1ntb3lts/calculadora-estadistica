public class CalculadoraEstadistica {
    public static double calcularMedia(double[] datos) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    public static void main(String[] args) {
        double[] datos = {10, 20, 30, 40, 50};
        System.out.println("Media = " + calcularMedia(datos));
    }
}
