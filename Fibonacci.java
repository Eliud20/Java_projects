import java.util.Scanner;
 
public class Fibonacci {
 
     public static void main(String[] args) {
 
          Scanner sc = new Scanner(System.in);
          System.out.print("Introduce el número de elementos a mostrar de la serie: ");
          int limite = sc.nextInt();

          /*Ciclo que manda los argumentos e imprime la serie en base
          a las posiciones que deseas ver*/
          for(int i = 0; i<limite; i++){
               System.out.print(funcionFibonacci(i) + ", ");
          }
     }
 
     private static int funcionFibonacci(int num){
         //Verifica si los argumentos son 1 o 0
          if(num == 0 || num==1)
               return num;
          else
               return funcionFibonacci(num-1) + funcionFibonacci(num-2);
         /*Los metodos se invocan tanatas veces que lo unico que se suman son
            unos*/      
     }
 
}