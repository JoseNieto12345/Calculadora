import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

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
                    Suma suma = new Suma();


                    break;
                case 2:
                    System.out.println("Resta");

                    Resta resta = new Resta();


                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    Multiplicacion multiplicacion = new Multiplicacion();

                    break;
                case 4:
                    System.out.println("Division");
                    Division division = new Division();


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
