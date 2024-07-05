import java.util.Scanner;

public class Workshop1 {
    public static void main (String[] arg){
        //EJERCICIO 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que operacion desea hacer?");
        String operacion = scanner.nextLine();

        switch (operacion) {
            case "suma":
            System.out.println("Ingrese el primer numero");
            int numeroUno = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numeroDos = scanner.nextInt();

            int Suma = numeroUno + numeroDos;
            System.out.println("La suma de " + numeroUno + " y " + numeroDos + " Es igual a: " + Suma);
                break;
        
            case "resta":
            System.out.println("Ingrese el primer numero");
            int numeroUnoResta = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numeroDosResta = scanner.nextInt();
    
            int Resta = numeroUnoResta - numeroDosResta;
            System.out.println("La Resta de " + numeroUnoResta + " y " + numeroDosResta + " Es igual a: " + Resta);
                break;

            case "multiplicacion":
                System.out.println("Ingrese el primer numero");
                int numeroUnoMutiplicacion = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                int numeroDosMultiplicacion = scanner.nextInt();

                int Multiplicacion = numeroUnoMutiplicacion * numeroDosMultiplicacion;
                System.out.println("La Multiplicacion de " + numeroUnoMutiplicacion + " y " + numeroDosMultiplicacion + " Es igual a: " + Multiplicacion);
                    break;

            case "division":
                System.out.println("Ingrese el primer numero");
                int numeroUnoDivision = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                int numeroDosDivison = scanner.nextInt();

                int Division = numeroUnoDivision / numeroDosDivison;
                System.out.println("La division de " + numeroUnoDivision + " y " + numeroDosDivison + " Es igual a: " + Division);
                    break;

            default:

                System.out.println("Valor incorrecto");
                break;
        }

        //EJERCICIO 2

        System.out.println("Sr usuario, ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad > 17) {
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }

        //EJERCICIO 3

        System.out.println("Ingrese la cantidad de kilometros: ");
        float kilometros = scanner.nextFloat();

        float millas = kilometros / 1.60934f;
        System.out.println(kilometros + " kilometros son " + millas + " millas");

        //EJERCICIO 4

        System.out.println("Sr usuario, ingrese su altura en metros: ");
        float altura = scanner.nextFloat();
        System.out.println("Sr usuario, ingrese su peso en kilogramos");
        float peso = scanner.nextFloat();

        Float IMC =  peso / (altura * altura);
        System.out.println("Su indice de masa corporal es: " + IMC);

        //EJERCICIO 5

        System.out.println("Sr usuario, ingrese un numero");
        float numeroRandom = scanner.nextFloat();

        if (numeroRandom > 0 && numeroRandom % 2 == 0) {
            System.out.println("El numero " + numeroRandom + " es positivo y es par");
        }else if (numeroRandom > 0 && numeroRandom % 2 != 0) {
            System.out.println("El numero " + numeroRandom + " es positivo y es impar");
        }else if (numeroRandom < 0 && numeroRandom % 2 == 0) {
            System.out.println("El numero " + numeroRandom + " es negativo y es par");
        }else if (numeroRandom < 0 && numeroRandom % 2 != 0) {
            System.out.println("El numero " + numeroRandom + " es negativo y es impar");
        }else{
            System.out.println("Es cero");
        }

        //EJERCICIO 6

        System.out.println("Sr usuario, ingrese un numero de un mes: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero  31 dias");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
            default:
                break;
        }
            scanner.nextLine();
        //EJERCICIO 7
 
        System.out.println("Sr usuario, ¿que desea sea realizar? suma, resta, multiplicacion, division: ");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "suma":
            System.out.println("Ingrese el primer numero");
            int numeroUno = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numeroDos = scanner.nextInt();

            int Suma = numeroUno + numeroDos;
            System.out.println("La suma de " + numeroUno + " y " + numeroDos + " Es igual a: " + Suma);
                break;
        
            case "resta":
            System.out.println("Ingrese el primer numero");
            int numeroUnoResta = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numeroDosResta = scanner.nextInt();
    
            int Resta = numeroUnoResta - numeroDosResta;
            System.out.println("La Resta de " + numeroUnoResta + " y " + numeroDosResta + " Es igual a: " + Resta);
                break;

            case "multiplicacion":
                System.out.println("Ingrese el primer numero");
                int numeroUnoMutiplicacion = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                int numeroDosMultiplicacion = scanner.nextInt();

                int Multiplicacion = numeroUnoMutiplicacion * numeroDosMultiplicacion;
                System.out.println("La Multiplicacion de " + numeroUnoMutiplicacion + " y " + numeroDosMultiplicacion + " Es igual a: " + Multiplicacion);
                    break;

            case "division":
                System.out.println("Ingrese el primer numero");
                int numeroUnoDivision = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                int numeroDosDivison = scanner.nextInt();

                int Division = numeroUnoDivision / numeroDosDivison;
                System.out.println("La division de " + numeroUnoDivision + " y " + numeroDosDivison + " Es igual a: " + Division);
                    break;

            default:
                System.out.println("Valor incorrecto");
                break;
        }

        //EJERCICIO 8 

         System.out.println("Sr usuario, ingrese su primera nota");
        float nota1 = scanner.nextFloat();
        System.out.println("Sr usuario, ingrese su segunda nota");
        float nota2 = scanner.nextFloat();
        System.out.println("Sr usuario, ingrese su tercera nota");
        float nota3 = scanner.nextFloat();

        float promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 6) {
            System.out.println("Has aprobado el curso, su nota es: " + promedio);
        }else{
            System.out.println("No has aprobado el curso, su nota es: " + promedio);
        } 

        //EJERCICIO 9
 
        System.out.println("Sr usuario, ingrese un año: ");
        int año = scanner.nextInt();

        if (año % 4 == 0 && año % 100 != 0) {
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisiesto");
        }

        //EJERCICIO 10

         System.out.println("Sr usuario, ingrese el total de la cuenta: ");
        int totalCuenta = scanner.nextInt();
        System.out.println("Sr usuario, ingrese el porcentaje de propina que desea dejar: ");
        int porcentajePropina = scanner.nextInt();

        int propina = (totalCuenta * porcentajePropina) / 100;

        System.out.println("La cantidad de propina que dejaras es: " + propina); 


        //EJERCICIO 11

         System.out.println("Sr usuario, ingrese el primer numero: ");
        int numeroPrimero = scanner.nextInt();
        System.out.println("Sr usuario, ingrese el primer numero: ");
        int numeroSegundo = scanner.nextInt();
        System.out.println("Sr usuario, ingrese el primer numero: ");
        int numeroTercero = scanner.nextInt();

        if (numeroPrimero < numeroSegundo && numeroPrimero < numeroTercero && numeroSegundo < numeroTercero) {
            System.out.println(numeroPrimero + "" + numeroSegundo + "" + numeroTercero);
        }else if(numeroSegundo < numeroPrimero && numeroSegundo < numeroTercero && numeroPrimero < numeroTercero){
            System.out.println(numeroSegundo + "" + numeroPrimero +"" + numeroTercero);
        }else if(numeroTercero < numeroPrimero && numeroTercero < numeroSegundo && numeroSegundo < numeroPrimero){
            System.out.println(numeroTercero + "" + numeroSegundo +"" + numeroPrimero);
        }else{
            System.out.println(numeroPrimero + "" + numeroTercero +""+ numeroSegundo);
        }

        //EJERCICIO 12

         System.out.println("Sr usuario, ingrese el numero de su mes: ");
        int mesZodiaco = scanner.nextInt();
        System.out.println("Sr usuario, ingrese su dia del mes: ");
        int diaZodiaco = scanner.nextInt();

        switch (mesZodiaco) {
            case 1:
                if (diaZodiaco >= 1 && diaZodiaco <= 19 ) {
                    System.out.println("Tu signo del zodiaco es Capricornio");
                }else if(diaZodiaco > 19 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Acuario");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 2:
                if (diaZodiaco >= 1 && diaZodiaco <= 18 ) {
                    System.out.println("Tu signo del zodiaco es: Acuario");
                }else if(diaZodiaco >= 19 && diaZodiaco <= 28){
                    System.out.println("Tu signo del zodiaco es: Piscis");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 3:
                if (diaZodiaco >= 1 && diaZodiaco <= 20 ) {
                    System.out.println("Tu signo del zodiaco es Piscis");
                }else if(diaZodiaco >= 21 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Aries");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 4:
                if (diaZodiaco >= 1 && diaZodiaco <= 19 ) {
                    System.out.println("Tu signo del zodiaco es: Aries");
                }else if(diaZodiaco >= 20 && diaZodiaco <= 30){
                    System.out.println("Tu signo del zodiaco es: Tauro");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 5:
                if (diaZodiaco >= 1 && diaZodiaco <= 20 ) {
                    System.out.println("Tu signo del zodiaco es: Tauro");
                }else if(diaZodiaco >= 21 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Geminis");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 6:
                if (diaZodiaco >= 1 && diaZodiaco <= 20 ) {
                    System.out.println("Tu signo del zodiaco es: Geminis");
                }else if(diaZodiaco >= 21 && diaZodiaco <= 30){
                    System.out.println("Tu signo del zodiaco es: Cancer");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 7:
                if (diaZodiaco >= 1 && diaZodiaco <= 22 ) {
                    System.out.println("Tu signo del zodiaco es Cancer");
                }else if(diaZodiaco >= 23 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Leo");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 8:
                if (diaZodiaco >= 1 && diaZodiaco <= 22 ) {
                    System.out.println("Tu signo del zodiaco es: Leo");
                }else if(diaZodiaco >= 23 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Virgo");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 9:
                if (diaZodiaco >= 1 && diaZodiaco <= 22 ) {
                    System.out.println("Tu signo del zodiaco es Virgo");
                }else if(diaZodiaco >= 23 && diaZodiaco <= 30){
                    System.out.println("Tu signo del zodiaco es: Libra");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 10:
                if (diaZodiaco >= 1 && diaZodiaco <= 22 ) {
                    System.out.println("Tu signo del zodiaco es: Libra");
                }else if(diaZodiaco >= 23 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Escorpio");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 11:
                if (diaZodiaco >= 1 && diaZodiaco <= 21 ) {
                    System.out.println("Tu signo del zodiaco es Escorpio");
                }else if(diaZodiaco >= 22 && diaZodiaco <= 30){
                    System.out.println("Tu signo del zodiaco es: Sagitario");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
            case 12:
                if (diaZodiaco >= 1 && diaZodiaco <= 21 ) {
                    System.out.println("Tu signo del zodiaco es: Sagitario");
                }else if(diaZodiaco >= 22 && diaZodiaco <= 31){
                    System.out.println("Tu signo del zodiaco es: Capricornio");
                }else{
                    System.out.println("Numero de dia erroneo");
                }
                break;
        
            default:
            System.out.println("Numero de mes erroneo");
                break;
        } 

        //EJERCICIO 13

         System.out.println("Sr usuario, ingrese la distancia del viaje: ");
        float distanciaViajes = scanner.nextFloat();

        int tarifaBase = 4300;
        int tarifaKilometro = 1300;

        float cobroTotal = distanciaViajes * tarifaKilometro + tarifaBase;
        System.out.println("El cobro del viaje es: " + cobroTotal);

        //EJERCICIOS 14

        System.out.println("Sr usuario, ingrese 1 si desea convertir de celsius a fahrenheit o 2 si desea convertir de fahrenheit a celsuis: ");
        int eleccionConversion = scanner.nextInt();

        switch (eleccionConversion) {
            case 1:
            System.out.println("Ingrese la cantidad de grados celsius a convertir");    
            float gradosCelsius = scanner.nextInt();

            float conversionFarenheit = gradosCelsius * 9/5 + 32;

            System.out.println(gradosCelsius + " grados celsius son equivalentes a: " + conversionFarenheit + " grados fahrenheit");
            
                break;
            case 2:
            System.out.println("Ingrese la cantidad de grados fahrenheit a convertir");    
            float gradosFahrenheit = scanner.nextInt();

            float conversionCelsius = (gradosFahrenheit - 32) * 5/9;

            System.out.println(gradosFahrenheit + " grados fahrenheit son equivalentes a: " + conversionCelsius + " grados celsius");
            
                break;
        
            default:
            System.out.println("Valor incorrecto");
                break;
        } 

        //EJERCICIO 15

        System.out.println("Sr usuario, ingrese la calificacion del examen, (0-100)");
        int calificacion = scanner.nextInt();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Tu calidicacion es un A");
        }else if(calificacion >= 80 && calificacion <= 89){
            System.out.println("Tu calificacion es un B");
        }else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("Tu calificacion es un C");
        }else if(calificacion >= 60 && calificacion <= 69){
            System.out.println("Tu calificacion es un D");
        }else if (calificacion <=59 && calificacion >= 0) {
            System.out.println("Tu calificacion es F");
        }else{
            System.out.println("Rango de nota erroneo");
        }
             scanner.close();
        }


    }
