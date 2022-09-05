package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {

    public static void main(String[] args) {
        //Sobreescritura
        Gerente gerente1 = new Gerente("Alex", 250.20, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        System.out.println("");
        //Polimorfismo
        Empleado empleado1 = new Empleado("Ricardo", 1000);
        imprimir(empleado1);
//        System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        System.out.println("");
        Gerente gerente2 = new Gerente("Karla", 2400, "Contabilidad");
        imprimir(gerente2);
//        System.out.println("gerente2 = " + gerente2.obtenerDetalles());

    }

    //COncepto de polimorfismo
    public static void imprimir(Empleado empleado)//empleado puede comportarse ocmo gerente
    {
        System.out.println("empleado = " + empleado.obtenerDetalles());//En tiempode ejecucion el tipo q se ejecuta es por el tipo que se le coloque en el metodo
    }
}
