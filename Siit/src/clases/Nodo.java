package clases;

public class Nodo {
    private String no_con;
    private int punt;
    private String nom;
    private String grup;
    private Nodo liga,p;
    
    public Nodo(){
        this.liga=null;
    }

    public String getNo_con() {
        return no_con;
    }

    public void setNo_con(String no_con) {
        this.no_con = no_con;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    
    
    
}
