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
                    System.out.println("Esfera");
                    System.out.print("Ingresa el radio de la esfera: ");
                    double radio = sc.nextDouble();
                    Esfera esfera = new Esfera(radio);

                    System.out.println("1 - Calcular Área");
                    System.out.println("2 - Calcular Volumen");
                    System.out.print("Elige una opción: ");
                    int opcionEsfera = sc.nextInt();

                    switch (opcionEsfera) {
                        case 1:
                            System.out.println("Área de la esfera: " + esfera.calcularArea());
                            break;
                        case 2:
                            System.out.println("Volumen de la esfera: " + esfera.calcularVolumen());
                            break;
                        default:
                            System.out.println("Opción no válida para esfera.");
                    }
                    break;
                case 2:
                    System.out.println("cubo");
                    System.out.print("Ingresa el lado del cubo: ");
                    double lado = sc.nextDouble();
                    Cubo cubo = new Cubo(lado);

                    System.out.println("1 - Calcular Área");
                    System.out.println("2 - Calcular Volumen");
                    System.out.print("Elige una opción: ");
                    int opcionCubo = sc.nextInt();

                    switch (opcionCubo) {
                        case 1:
                            System.out.println("Área del cubo: " + cubo.calcularArea());
                            break;
                        case 2:
                            System.out.println("Volumen del cubo: " + cubo.calcularVolumen());
                            break;
                        default:
                            System.out.println("Opción no válida para cubo.");
                    }
                    break;
                case 3:
                    System.out.println("Pirámide");
                    System.out.print("Ingresa la base de la pirámide: ");
                    float base = sc.nextFloat();
                    System.out.print("Ingresa la altura de la pirámide: ");
                    float altura = sc.nextFloat();
                    System.out.print("Ingresa la altura lateral de la pirámide: ");
                    float alturaLateral = sc.nextFloat();

                    Piramide piramide = new Piramide(base, altura, alturaLateral);

                    System.out.println("1 - Calcular Área");
                    System.out.println("2 - Calcular Volumen");
                    System.out.print("Elige una opción: ");
                    int opcionPiramide = sc.nextInt();

                    switch (opcionPiramide) {
                        case 1:
                            System.out.println("Área de la pirámide: " + piramide.calcularArea());
                            break;
                        case 2:
                            System.out.println("Volumen de la pirámide: " + piramide.calcularVolumen());
                            break;
                        default:
                            System.out.println("Opción no válida para pirámide.");
                    }
                    break;
                case 4:
                    System.out.println("Cono");
                    System.out.print("Ingresa el radio del cono: ");
                    float radioCono = sc.nextFloat();
                    System.out.print("Ingresa la altura del cono: ");
                    float alturaCono = sc.nextFloat();
                    System.out.print("Ingresa la generatriz del cono: ");
                    float generatriz = sc.nextFloat();

                    Cono cono = new Cono(radioCono, alturaCono, generatriz);

                    System.out.println("1 - Calcular Área");
                    System.out.println("2 - Calcular Volumen");
                    System.out.print("Elige una opción: ");
                    int opcionCono = sc.nextInt();

                    switch (opcionCono) {
                        case 1:
                            System.out.println("Área del cono: " + cono.calcularArea());
                            break;
                        case 2:
                            System.out.println("Volumen del cono: " + cono.calcularVolumen());
                            break;
                        default:
                            System.out.println("Opción no válida para cono.");
                    }
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
}