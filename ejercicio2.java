import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int No=0;
    int mayor =0;
    int menor =0;
    while(No<10){
      double Nota;
      System.out.print("Ingrese 10 notas:");
      Nota=teclado.nextDouble();
    
    if(Nota>=7){
      mayor = mayor+1;
    }else{
      menor = menor+1;
    }
    No=No+1;
    }
    System.out.println("notas mayores de 7:"+mayor);
    System.out.println("notas menores de 7:"+menor);
}
}