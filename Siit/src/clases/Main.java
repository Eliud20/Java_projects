package clases;

public class Main {

    public static void main(String[] args) {
        Alumnos lista = new Alumnos();
        lista.insFinal("Eliud", "18041250", "3Y", 1200);
        lista.insFinal("Crhistian", "18041251", "3Y", 1200);
        lista.insInicio("Fernanda", "18041252", "3Y", 1300);
        lista.listar();
    }
    
}
