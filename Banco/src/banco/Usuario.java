package banco;

public class Usuario {
    
    String nombre,cue;
    int cant;
    
    public Usuario(String nombre,String cue,int cant){
        this.nombre=nombre;
        this.cue=cue;
        this.cant+=cant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCue() {
        return cue;
    }

    public void setCue(String cue) {
        this.cue = cue;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant += cant;
    }
    
}
