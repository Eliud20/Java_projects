import java.util.*;
public class Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        // 1. Se invoca el metodo y se envian los argumentos
        Hanoi(n,1,2,3);  //1:origen  2:auxiliar 3:destino
    }



public static void Hanoi(int n, int origen,  int auxiliar, int destino){
  //2. Verifica si el numero de discos es igual a 1
  if(n==1)
  System.out.println("mover disco de " + origen + " a " + destino);
  else{
     /*3. Se vuelve a invocar el metodo restandole un disco e intercambiando el
          orden de los argumentos para que en ciertos movientos la torre auxiliar
          sea la de destino*/
     Hanoi(n-1, origen, destino, auxiliar);
     /*4. En la siguiente linea el disco que está al tope ya se movió y se imprimió
       la instruccion en el paso 2 entonces se devuelve al metodo invocado ante
       de ese y se imprime la instrucción con el orden de los argumentos cambiado*/
     System.out.println("mover disco de "+ origen + " a " + destino);
     /*5. Mueve el disco más pequeño hacia la torre auxiliar cambiando el orden
       de los argumentos para tomar la torre auxiliar como la de destino */
     Hanoi(n-1, auxiliar, origen, destino);
     /*6. Regresa a la primera invocacion con los primeros argumentos y mueve
       disco más grande, despues vuelve a invocar la linea del paso 5 y vuelve a repetir los pasos*/
   }
 }
}