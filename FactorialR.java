import java.util.*;
public class FactorialR {

public static int factorial (int numero) { //Se crea el metodo en int porque va a regresar el valor entero con parametros del mismo tipo 
/*Verifica si el parametro es igual a 0, si lo es se retorna el valor 1 porque
el factorial de 0 es 1; de lo contrario se continuará con el else*/
if (numero == 0) return 1;  
     /*Si el numero no es 0 retorna el numero ingresado llama al mismo metodo
       restando un numero y así susecivamente hasta llegar al 1 y se termina
       multiplicando los demás numeros almacenados en las invocaciones anteriores*/
else return numero * factorial(numero-1);
}
public static void main(String[] args) {
System.out.println("Factorial de 5 es: " + factorial(5));//Se imprime el resultado
}
}
