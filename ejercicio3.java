import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int No=0;
    int Cantidad;
    int Conta1=0;
    int Conta2=0;
          System.out.print("Ingrese cantidad de numeros:");
      Cantidad=teclado.nextInt();
    while(No<Cantidad){
      double Num;
      No=No+1;
      System.out.print("Ingrese numero "+No+": ");
      Num=teclado.nextDouble();
    if(Num%2==0){
      Conta1=Conta1+1;
    }else{
      Conta2=Conta2+1;
    }
    ;    
  
}
System.out.println("Numeros pares: "+Conta1);
System.out.println("Numeros inpares: "+Conta2);

}}