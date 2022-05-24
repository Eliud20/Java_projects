package clases;

import javax.swing.JOptionPane;

public class Alumnos {
    
    Nodo P;
    
    public void Alumnos(){
        P = null;
    }
    
    public void registrarAlumno(Nodo alum, String nom, String no_con, String grup, int punt){
        alum.setGrup(grup);
        alum.setNo_con(no_con);
        alum.setNom(nom);
        alum.setPunt(punt);
        
    }
    
    public void insFinal(String nom, String no_con, String grup, int punt){
        
        Nodo alum = new Nodo();
        registrarAlumno(alum,nom, no_con, grup, punt);
        
        if (P==null){
            P = alum; 
        } else {
           Nodo R=P;
           
           while(alum.getLiga() != null){
               R = R.getLiga();               
           }
           
           R.setLiga(alum);
        }
    }
    
    public void insInicio(String nom, String no_con, String grup, int punt){
        Nodo alum = new Nodo();
        registrarAlumno(alum,nom, no_con, grup, punt);
        
        if (P==null){
            P = alum;
        } else {
            Nodo aux=P;
            alum.setLiga(aux);
            P=alum;
        }
    }
    
    public void insAntNod(Nodo p, String nom, String no_con, String grup, int punt){
        Nodo alum = new Nodo();
        registrarAlumno(alum,nom, no_con, grup, punt);
        String nom1=JOptionPane.showInputDialog("Ingrese el nombre que busca: ");
        if (P==null){
            P = alum; 
        } else 
            if(nom1.equals(P.getNom())){
            insInicio(nom, no_con, grup, punt);
            } else {
            Nodo R=P;
            Nodo Ant=R;
            while (R!=null){
                if (R.getNom().equals(nom1)){
                    
                }
            }
            if(R==null){
                insFinal(nom, no_con, grup, punt);
            }
        }
    }
    
    public void insDesNod(Nodo p, String nom, String no_con, String grup, int punt){
        Nodo alum = new Nodo();
        registrarAlumno(alum,nom, no_con, grup, punt);
    }
    
    public void listar(){
        Nodo R = P;
        while(R!=null){
        System.out.println(R.getNom()+"\n"+R.getNo_con()+"\n"+R.getGrup()+"\n"+R.getPunt()+"\n");
        R=R.getLiga();
        }
    }
    
    
}
