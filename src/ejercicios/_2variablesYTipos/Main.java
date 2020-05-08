package ejercicios._2variablesYTipos;

public class Main {
    public static void main(String[] args) {
        int hora = 23;
        int minuto = 55;
        int segundo = 20;

        String horaActual = hora + ":" + minuto + ":" + segundo;
        int segundosDesdeMedianoche = (hora * 60 * 60) + (minuto * 60) + segundo;
        int segundosparaMedianoche = (24 * 60 * 60)- segundosDesdeMedianoche;
        int porcentajeTrascursoDia = (hora*100/24);

        System.out.println(horaActual);
        System.out.println("Cantidad de segundos desde la medianoche: " + segundosDesdeMedianoche);
        System.out.println("Cantidad de segundos para llegar a medianoche: " + segundosparaMedianoche);
        System.out.println(porcentajeTrascursoDia + " %");
    }
}
