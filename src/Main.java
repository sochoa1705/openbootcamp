import com.sun.source.tree.WhileLoopTree;

public class Main {
    public static void main(String[] args) {
        int numbPos = 5, numbNeg=-2, numb=0;
        int numbWhile=1;
        String season = "Verano";
        /*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

        //Ingresando un número positivo
        sentenceIf(numbPos);
        //Ingresando un número negatrivo
        sentenceIf(numbNeg);
        //Ingresando el 0
        sentenceIf(numb);

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/
        sentenceWhile(numbWhile);


        /*Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.*/

        sentenceDoWhile(numbWhile);

        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
         se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
        sentenceFor();
        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.*/
        sentenceSwitch(season);

    }
    /*Funciones para representar cada sentencia de control*/
    public static void sentenceIf(int numeroIf)
    {
        if(numeroIf>0)
        {
            System.out.println("El número "+numeroIf +" es Positivo");
        } else if (numeroIf<0) {
            System.out.println("El número "+numeroIf +" es Negativo");
        }else {
            System.out.println("El número "+numeroIf +" es Cero");
        }
    }
    public static void sentenceWhile(int numeroWhile)
    {
        while (numeroWhile < 3)
        {
            numeroWhile++;
            System.out.println("El número es: "+numeroWhile);
        }

    }
    public static void sentenceDoWhile(int numeroDoWhile)
    {
        do {
            numeroDoWhile++;
            System.out.println("El número es: "+numeroDoWhile);
        }while (numeroDoWhile > 3);

    }
    public static void sentenceFor()
    {
        for (int numeroFor = 0; numeroFor <= 3;numeroFor++)
        {
            System.out.println("El número actual es: "+ numeroFor);

        }

    }
    public static void sentenceSwitch(String estacion)
    {
        switch (estacion)
        {
            case "Verano":
                System.out.println("Se encuentra en la estación de verano");
                break;

            case "Invierno":
                System.out.println("Se encuentra en la temporada de invierno");
                break;

            case "Otoño":
                System.out.println("Se encuentra en la temporada de otoño");
                break;
            case "Primavera":
                System.out.println("Se encuentra en la temporada de primavera");
                break;
            default:
                System.out.println("La temporada ingresada es: " + estacion);
        }

    }
}