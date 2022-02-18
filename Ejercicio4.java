import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double cuad1 = 0;
    double cuad2 = 0;
    double cuad3 = 0;
    double cuad4 = 0;
    int cantidad;
    System.out.print("Cuantos puntos son: ");
    cantidad=teclado.nextInt();
    for (int i =1; i<= cantidad; i++){
      double x;
      double y;
      System.out.print("Coordenada X: ");
      x=teclado.nextDouble();
            System.out.print("Coordenada Y: ");
      y=teclado.nextDouble();
      if(x > 0 && y > 0) {
        cuad1++;
      }
        if(x < 0 && y > 0) {
        cuad2++;
      }
        if(x < 0 && y < 0) {
        cuad3++;
      }
        if(x > 0 && y < 0) {
        cuad4++;
      
      }}
    System.out.println("cantidad de punto cuadrante 1: "+cuad1);
        System.out.println("cantidad de punto cuadrante 2: "+cuad2);
            System.out.println("cantidad de punto cuadrante 3: "+cuad3);
                System.out.print("cantidad de punto cuadrante 4: "+cuad4);
    
    }
  }