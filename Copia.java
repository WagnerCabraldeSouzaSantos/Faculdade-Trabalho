public class Copia{


    private String filTitulo;
    private int codigoCop2;
    private static int codigoCop = 1000;
    
    Copia(Filme filme){
        
        this.filTitulo = filme.getFilTitulo();
        Copia.codigoCop = Copia.codigoCop + 1;
        this.codigoCop2 = Copia.codigoCop;
    }
    
    public String getTitulo(){
        
        return this.filTitulo;
    }
    
    public int getCodigo(){
        
        return this.codigoCop2;
    }
        
}