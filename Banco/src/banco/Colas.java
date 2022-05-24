package banco;

import javax.swing.JOptionPane;

public class Colas {
    
   public void encolar(int cola[],int ins, int elim, int turn){
        
        if(ins==0){
            cola[ins]=turn;
            turn++;
            ins++;
        }else
        
        if (ins==elim){
            JOptionPane.showMessageDialog(null,"No hay espacio en la cola");
        } else 
            
            if (ins>elim && ins<cola.length || ins<elim){
            cola[ins]=turn;
            turn++;
            ins++;
        } else
        
        if (ins==cola.length && elim>0){
            ins=0;
            cola[ins]=turn;
            turn++;
            ins++;
        }
    }
    
    public void desencolar(int cola[],int ins, int elim, int turn){
        
        if (elim==0){
            cola[elim]=0;
            elim++;
        } else 
            
            if(elim==cola.length && ins!=0 && ins!=elim){
                elim=0;
                cola[elim]=0;
                elim++;
            }
        if (elim==ins){
            JOptionPane.showMessageDialog(null,"No hay espacio en la cola");
        }
    }
    
}
