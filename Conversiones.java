import java.util.Stack;
import javax.swing.JOptionPane;

public class Conversiones {

public static int Oper(int op1,int op2, char operador){
        int val=0;
        switch (operador){
        case '+':
            val=op1+op2;
            break;
        case '-':
            val=op1-op2;
            break;
        case '/':
            val=op1/op2;
            break;
        case '*':
            val=op1*op2;
            break;
        case '^':
            val=1;
            for(int i=1;i<=op2;i++){
                val=val*op1;
            }
            break; 
        }

        return val;
    }
    
    public static boolean Ver(char operador){
        boolean ver=false;
        switch (operador){
            case '+':case'-':case'*':case'/':case'^':
        ver=true;
        break;
        }
        return ver;
    }
    
    public static String validarInfija(){
        int x=0, y=1, a1, a2,ab=0,c=0;
        char a, b;
        int recorredor=0;
        int validar =0,v=0;
        String infija;
        
        char Oper[]={'+','-','*','/','^','(',')'};
        do{
            infija=JOptionPane.showInputDialog("Introduzca la expresion infija").toUpperCase().trim();
        
        while (recorredor < infija.length()){
            //CONTAR PARENTESIS ABIERTOS Y CERRADOS
                   if(infija.charAt(recorredor) == Oper[5]){
                        ab++;

                   }else if(infija.charAt(recorredor) == Oper[6]){
                        c++;

                   }
                   recorredor++;
        }
        
        if(infija.length()>=3 ){
            while(x < infija.length() && y<infija.length()){
                
                   //EMPIEZA CON OPERADOR
                    for (int i=0;i<=4;i++){
                       if(Oper[i]==(a=infija.charAt(0))){
                           JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                                   + " No se puede empezar con un operador");
                           v=1;
                           break;
                       } 
                   }
                   //PARENTESIS VACIOS
                   if (ab != c){
                       JOptionPane.showMessageDialog(null, "Escribe tu expresión infija de forma correcta\n"
                               + "No se encuentra el mismo número de parentesis abiertos que cerrados");
                       v=1;
                       break;
                   }
                   
                   if(Character.isDigit(infija.charAt(x))){
                       JOptionPane.showMessageDialog(null, "Escribe tu expresión infija de forma correcta\n"
                               + "No se pueden ingresar numeros");
                       v=1;
                       break;
                   }
                   
                   //EMPIEZA CON PARENTESIS CERRADO
                   if(')'==(infija.charAt(0))){
                       JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                        + "No se puede empezar con un parentesis cerrado");
                       v=1;
                        break;
                   }
                   
                   //TERMINA CON OPERADOR
                   for (int i=0;i<=4;i++){
                       if(Oper[i]==(infija.charAt(infija.length()-1))){
                           JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                                   + " No se puede terminar con un operador");
                           v=1;
                           break;
                       }
                   }

                   //TERMINA CON PARENTESIS ABIERTO
                   if('('==(infija.charAt(infija.length()-1))){
                           JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                                   + " No se puede terminar con un parentesis abierto");
                           v=1;
                           break;
                       }
                   
                   //SE ENCUENTRAN 2 OPERANDOS JUNTOS
                   a=infija.charAt(x);
                   a1=(int)a;
                   b=infija.charAt(y);
                   a2=(int)b;

                   if(a1>=65 && a1<=90){
                       if(a2>=65 && a2<=90){
                           JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                                   + " No se puede colocar 2 operandos juntos");
                           v=1;
                          break;
                       }
                   }

                   //SE ENCUENTRAN 2 OPERADORES JUNTOS
                   for(int i=0;i<=6;i++){
                       if(infija.charAt(x)==Oper[i]){
                           a1=i;
                       }
                       if(infija.charAt(y)==Oper[i]){
                           a2=i;
                       }
                   }

                   if (a1>=0 && a1<=4){
                       if (a2>=0 && a2<=4){
                           JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                                   + " No se puede colocar 2 operadores juntos");
                           v=1;
                           break;
                        }
                   }

                   //PARENTESIS VACIO
                    if (a1==5 ){
                       if (a2==6){
                           JOptionPane.showMessageDialog(null,"Escribe tu expresión infija de forma correcta\n"
                                   + "Se encuentran parentesis solos en la expresion");
                           v=1;
                           break;
                        }
                       
                   }
                   x++;
                   y++;
                 validar = 0;
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Complete la expresión");
            v=1;
            validar = 0;
        }
        if (v!= 1){
            validar ++;
            JOptionPane.showMessageDialog(null, "La expresión infija escrita es válida");
        }   
        v=0;
        }while(validar == 0);
        
        return infija;
    }
    
    public static String convertirPre(String exp){
        Stack <String> pila= new Stack <>();
        
        String post="",valPila = "";
        int val=0,val1=0;
        char letra=' ',letraT=' ';
        
        String oper="",operCad;
        
        for(int i=exp.length()-1;i>=0;i--){
            oper = Character.toString(exp.charAt(i));
            if(exp.codePointAt(i)>=65 && exp.codePointAt(i)<=90){//operando
                post+=exp.charAt(i);
            }//operador
            else if(pila.empty()){
                pila.push(oper);
//                System.out.println("pila"+pila.peek());
            }else{
                
                //Jerarquia de operadores
                
                    //Operador en la cadena
                    letra=exp.charAt(i);
//                    
                            switch(letra){
                                case '+':
                                case '-':
                                    val = 0;
                                    break;
                                case '*':
                                case '/':
                                    val = 1;
                                    break;
                                case '^':
                                    val = 2;
                                    break;
                            }
                  
                    
                    valPila = pila.peek();
                    
                    switch(valPila){
                        case "+":
                        case "-":
                            val1 = 0;
                            break;
                        case "*":
                        case "/":
                            val1 = 1;
                            break;
                        case "^":
                            val1 = 2;
                            break;
                    }
                    
                    //Operador en pila
                    
//                    System.out.println("Letra: "+letraT);
//                    
                    System.out.println("val = "+val+" val 1 = "+val1 );
                    
                    //mete o saca

                    if(val>=val1){
                        System.out.println("entroAqui: "+oper);
                        pila.push(oper);
                    } else {
                        //oper=Character.toString(letra);
                        while(!pila.empty()){
                            System.out.println("entroWhile: ");
                            post+=pila.peek();
                            pila.pop();
                        }
                        pila.push(oper);
                    }
            }
           val=0;
           val1=0;
           letra=' ';
           letraT=' '; 
           oper="";
        }
        
        System.out.println("antes: " + pila);
        while(!pila.empty()){
            System.out.println("entro: ");
            post+=pila.peek();
            pila.pop();
        }
        
        String pre="";
        for(int j=post.length()-1;j>=0;j--){
            pre+=post.charAt(j);
        }
                System.out.println("prefija: "+pre);
                return pre;
    }
    
    public static String convertirPost(String exp){
        Stack <String> pila= new Stack <>();
        String post="",valPila = "";
        int val=0,val1=0;
        char letra=' ',letraT=' ';
        
        String oper="",operCad;
        
        for(int i=0;i<exp.length();i++){
            oper = Character.toString(exp.charAt(i));
            if(exp.codePointAt(i)>=65 && exp.codePointAt(i)<=90){//operando
                post+=exp.charAt(i);
            }//operador
            else if(pila.empty()){
                pila.push(oper);
//                System.out.println("pila"+pila.peek());
            }else{
                
                //Jerarquia de operadores
                
                    //Operador en la cadena
                    letra=exp.charAt(i);
//                    System.out.println("Letra: "+letra);
                    //for(int k=0;k<car.length;k++){
                            switch(letra){
                                case '+':
                                case '-':
                                    val = 0;
                                    break;
                                case '*':
                                case '/':
                                    val = 1;
                                    break;
                                case '^':
                                    val = 2;
                                    break;
                            }
                    //}
                    
                    valPila = pila.peek();
                    
                    switch(valPila){
                        case "+":
                        case "-":
                            val1 = 0;
                            break;
                        case "*":
                        case "/":
                            val1 = 1;
                            break;
                        case "^":
                            val1 = 2;
                            break;
                    }
                    
                    //Operador en pila
                    
//                    System.out.println("Letra: "+letraT);
//                    
                    System.out.println("val = "+val+" val 1 = "+val1 );
                    
                    //mete o saca

                    if(val>=val1){
                        System.out.println("entroAqui: "+oper);
                        pila.push(oper);
                    } else {
                        //oper=Character.toString(letra);
                        while(!pila.empty()){
                            System.out.println("entroWhile: ");
                            post+=pila.peek();
                            pila.pop();
                        }
                        pila.push(oper);
                    }
            }
           val=0;
           val1=0;
           letra=' ';
           letraT=' '; 
           oper="";
        }
        
        System.out.println("antes: " + pila);
        while(!pila.empty()){
            System.out.println("entro: ");
            post+=pila.peek();
            pila.pop();
        }
        System.out.println("postfija: "+post);
        return post;
    }
    
    public static void evaluarPre(int valPre, int valores[], String operadores[], String exp){
        int op1,op2,res;
        int cont = 0, cont2 = 0;
        //String conc;
        Stack <Integer> pilaPre = new Stack <>();
        //String o;
            for(int j=exp.length()-1;j>=0;j--){
                if (Character.isDigit(exp.charAt(j))){
                    pilaPre.push(Integer.parseInt(Character.toString(exp.charAt(j))));
                }   else{
                        if(Ver(exp.charAt(j))==true && !pilaPre.isEmpty()){
                            op2=pilaPre.pop();
                            op1=pilaPre.pop();
                            res=Oper(op1,op2,exp.charAt(j));
                            pilaPre.push(res);
                        }
                    }
            }
//            for (int i = exp.length()-1; i >= 0; i--){
//                if (operadores[cont2] = "+"){
//                    
//                }
//            }
            valPre=Integer.parseInt(exp);
    }
    public static int getEvaluarPre(int valPre){
        return valPre;
    }
    
    public static void asignarValOperandos(String exp, int[] valores){
        char[] cadena = exp.toCharArray();
        int j = 0;
        if (valores[0] == 0 ){
            for (int i = 0; i <= exp.length()-1; i++){
                if (Character.isLetter(cadena[i])){
                    valores[j] = Integer.parseInt(JOptionPane.showInputDialog("De valor a "+cadena[i]));
                    j++;
                }
            }
        }   else{
                JOptionPane.showMessageDialog(null, "Valores ya asignados");
            }
    }
    public int[] getValOperadores(int[] valores){
        return valores;
    }
    
    public static void asignarValOperadores(String exp, String[] operadores){
        
        char[] cadena = exp.toCharArray();
        int j = 0;
        if (operadores[0] != null){
            for (int i = 0; i <= exp.length(); i++){
                if (!Character.isLetter(cadena[i])){
                    operadores[j] = Character.toString(cadena[i]);
                }
            }
        }
    }
    public String[] getValOperador(String [] operadores){
        return operadores;
    }
    
    public static void main(String[] args) {
        int op=0, ev=0;
        String exp;
        exp = validarInfija();
        String Pref="";
        String valo[]= new String[exp.length()];
        
        int valPre = 0;
        int valores[] = new int [50];
        String operadores[] = new String[50];
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion que desee realizar:\n1. Convertir a prefija"
                +"\n2. Convertir a posfija\n3. Evaluar\n4. Salir"));
            switch(op){
                case 1: //convertir a prefija
                    Pref=convertirPre(exp);
                    break;
                    
                case 2: //convertir a posfija
                    convertirPost(exp);
                    break;
                case 3: //Evaluar
                    do{
                        ev=Integer.parseInt(JOptionPane.showInputDialog("Eliga la opción que desee realizar:"
                            +"\n1. Dar valor a las variables\n2. Evaluar en infija\n3. Evaluar en prefija"
                            +"\n4. Evaluar en posfija\n5. Regresar"));
                        switch(ev){
                            case 1: //Dar valor a las variables
                                asignarValOperadores(exp, operadores);
                                asignarValOperandos(exp, valores);
                                break;
                            case 3: //Evaluar Prefija
                                //evaluarPre(convertirPre(exp), valo);
                                evaluarPre(valPre, valores, operadores, exp);
                                getEvaluarPre(valPre);
                                break; 
                        }
                    }while(ev!=5);
                break;
            }
        }while(op!=4);
           
    }
    
}