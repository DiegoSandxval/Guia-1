import java.util.*;
class Main {
  public static void main(String[] args) {
    
   Scanner teclado = new Scanner(System.in);
   int num1, num2;
  System.out.println("Primer Numero:");
num1 = teclado.nextInt();
  System.out.println("Segundo Numero:");
num2 = teclado.nextInt();

if (num1%num2==0){
  System.out.print(num1 + " si es divisible por " + num2);
}else{
  System.out.print("No son numeros divisibles");
}

  }
}