import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int res1=0;
        res1 = tripleSum(10,75,58);
        System.out.println("Resultado Primera Parte: "+res1);

        Coche car = new Coche();
        //Num puertas sin agregar
        System.out.println("Puertas: " +car.puertasNum);
        //Agregamos una puerta más al coche
        car.agregarPuerta();
        //Mostramos el num de puertas actuales
        System.out.println("Puertas Actuales: "+ car.puertasNum);

    }

    //Primera Parte
    public static int tripleSum(int a, int b, int c)
    {
        return a+b+c;
    }


}

//Segunda Parte
class Coche
{
    public int puertasNum = 4;

    public int agregarPuerta()
    {
        return this.puertasNum++;
    }

}

