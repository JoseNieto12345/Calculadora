import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        int numero1,numero2;

        do{
            System.out.println("Calculadora");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Divicion");
            System.out.println("0-Salir");
            System.out.println("Selecciona una opcion:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Suma");
                    System.out.println("Ingresa el primer numero:");
                    numero1 = sc.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = sc.nextInt();
                    Suma suma = new Suma(numero1,numero2);
                    
                    System.out.println("Resultado: "+suma.result());

                    break;
                case 2:
                    System.out.println("Resta");

                    System.out.println("Ingresa el primer numero:");
                    numero1 = sc.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = sc.nextInt();
                    Resta resta = new Resta(numero1,numero2);
                    System.out.println("Resultado: "+resta.getResultado());

                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    System.out.println("Ingresa el primer numero:");
                    numero1 = sc.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = sc.nextInt();
                    Multiplicacion multiplicacion = new Multiplicacion();
                    System.out.println("Resultado: "+multiplicacion.operar(numero1,numero2));
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("Ingresa el primer numero:");
                    numero1 = sc.nextInt();
                    System.out.println("Ingresa el segundo numero:");
                    numero2 = sc.nextInt();
                    Division Division = new Division();
                    Division.Division(numero1,numero2);
                    System.out.println("Resultado: "+Division.getResultado());



                    break;
                case 0:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Ingreasa una opcion valida");
            }

        }while(opcion!=0);
    }


    }
