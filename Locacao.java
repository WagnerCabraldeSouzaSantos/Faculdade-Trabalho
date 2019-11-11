import java.math.BigDecimal;
import java.util.ArrayList;

public class Locacao {

    private BigDecimal rgSoc;
    private ArrayList<Integer>codigoCop = new ArrayList<Integer>();
    private static int locCodigo = 0;
    private int locCodigo2;
    
    Locacao(int[] cod, Socio socio) {
        this.rgSoc = socio.getRgSoc();
        for(int i = 0; i < cod.length; i++){
            codigoCop.add(cod[i]);
        } 
        
        Locacao.locCodigo = Locacao.locCodigo + 1;
        this.locCodigo2 = Locacao.locCodigo;
    }

    public BigDecimal getRgSoc( ){
        return this.rgSoc;
    }

    public void getCodigoCop(){

        for(int i = 0; i < codigoCop.size();i++){
            System.out.println(codigoCop.get(i));
        }
    }
    

    public int getLocCodigo() {
        return this.locCodigo2;
    }

}