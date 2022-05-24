package banco;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
public class BancoColas extends Inicio{
    
    public static void main(String args[]) {
        Queue ventanilla1 = new LinkedList(); //transferencias, pagos, etc
        Queue ventanilla2 = new LinkedList(); //retiro de dinero
        Queue ventanilla3 = new LinkedList(); //deposito de dinero
        Queue ventanilla4 = new LinkedList(); //ahorro
        
        Timer temp = new Timer();
        TimerTask tarea = new TimerTask(){
            int segundos=0;
//            @Override
            public void run() {
                segundos++;
                System.out.println("Segundo: "+segundos); //imprime los segundos
                if (segundos == 10){ //cada n segundos se va a eliminar el primer espacio de las colas
                    if (!ventanilla1.isEmpty()){ 
                        ventanilla1.remove();
                    }
                    if (!ventanilla2.isEmpty()){
                        ventanilla2.remove();
                    }
                    if (!ventanilla3.isEmpty()){
                        ventanilla3.remove();
                    }
                    if (!ventanilla4.isEmpty()){
                        ventanilla4.remove();
                    }
                    segundos = 0;
                }
            }
        };
        temp.schedule(tarea, 0, 1000); //se crea una tarea que se ejecuta sin retraso cada 1000 milisegundos
        
        String opc;
        String[] op = {"1","2","3","4","5","8","9"};
        
        String vent1="", vent2="", vent3="", vent4="";
        do {
            opc = (String) JOptionPane.showInputDialog(null, "Bienvenido al banco nacional de durango"
                + "\n¿Qué desea hacer?\n\n1. Transferir\n2. Depositar\n3. Retirar\n4. Pagar\n5. Ahorrar"
                + "\n8. Observar las colas\n9. Salir","Banco nacional de durango",JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
            switch (opc){
                case "1": //transerir
                    vent1+="Ⓕ";
                    ventanilla1.offer(vent1);
                    //System.out.println(ventanilla1); //imprime el dato que entra a la cola, en este caso entra un simbolo simulando una persona
                    vent1="";
                break;
                case "2": //depositar
                    vent3+="Ⓕ";
                    ventanilla3.offer(vent3);
                    vent3="";
                break;
                case "3": //retirar
                    vent2+="Ⓕ";
                    ventanilla2.offer(vent2);
                    vent2="";
                break;
                case "4": //pagar
                    vent1+="Ⓕ";
                    ventanilla1.offer(vent1);
                    vent1="";
                break;
                case "5": //ahorrar
                    vent4+="Ⓕ";
                    ventanilla4.offer(vent4);
                    vent4="";
                break;
                case "8":
                    if (ventanilla1 != null || ventanilla2 != null || ventanilla3 != null || ventanilla4 != null){
                        JOptionPane.showMessageDialog(null, "Colas: \n"+"Ventanilla 1: "+ventanilla1+"\nVentanilla 2: "
                        +ventanilla2+"\nVentanilla 3: "+ventanilla3+"\nVentanilla 4: "+ventanilla4);
                    }
                break;
            }
        } while (opc != "9");
        temp.cancel(); //metodo que termina el contador
        JOptionPane.showMessageDialog(null, "Gracias por consultar :D");
    }
}