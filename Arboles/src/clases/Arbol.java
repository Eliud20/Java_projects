package clases;

public class Arbol {
    
    private Nodo raiz;
    
    public Arbol( int valor ) {
        this.raiz = new Nodo( valor );
    }

    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }
    
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void agreNodo(int valor, Nodo nod, Nodo raiz){
        Nodo nuevo = new Nodo(valor);
        
        if(raiz == null){
            this.setRaiz(nuevo);
        } else 
            if(raiz.getValor() <= nuevo.getValor()){
                if(raiz.getIzq() == null){
                    raiz.setIzq(nuevo);
                } else {
                    agreNodo(valor,nuevo,raiz.getIzq());
                }     
        }   else {
                if(raiz.getDer() == null){
                    raiz.setDer(nuevo);
                } else {
                    agreNodo(valor,nuevo,raiz.getDer());
                }
            }
        
    }
    
    public void recoInOrd(Nodo nodo){
        
        if(nodo == null);
        
        recoInOrd(nodo.getIzq());
        System.out.println(nodo.getValor()+" ");
        recoInOrd(nodo.getDer());
    }
    
    public void recoPreOrd(Nodo nodo){
        
        if(nodo == null);
        
        System.out.println(nodo.getValor()+" ");
        recoInOrd(nodo.getIzq());
        recoInOrd(nodo.getDer());
    }
    
    public void recoPosOrd(Nodo nodo){
        
        if(nodo == null);
        
        recoInOrd(nodo.getIzq());
        recoInOrd(nodo.getDer());
        System.out.println(nodo.getValor()+" ");
    }
    
    
}

