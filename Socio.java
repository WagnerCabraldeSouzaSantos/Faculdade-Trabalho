import java.math.BigDecimal;

public class Socio {

    //Atributos da classe socio
    BigDecimal rgSoc  = new BigDecimal(1);
    String     nomeSoc;
    String     endereçoSoc;
    long       telefoneSoc;
    BigDecimal cpfSoc = new BigDecimal(1);
    String     dataDeAdesaoSoc;
    
    
    

    //setter e getter

    public void setRgSoc(BigDecimal rg) {
        rgSoc = rg;
    }

    public void setNomeSoc(String nome) {
        nomeSoc = nome;
    }

    public void setEnderecoSoc(String endereco) {
        endereçoSoc = endereco;
    }

    public void setTelefoneSoc(long telefone) {
        telefoneSoc = telefone;
    }

    public void setCpfSoc(BigDecimal cpf) {
        cpfSoc = cpf;
    }

    public void setDataDeAdesaoSoc(String data) {
        dataDeAdesaoSoc = data;
    }

    public BigDecimal getRgSoc() {
        return rgSoc;
    }

    public String getNomeSoc() {
        return nomeSoc;
    }

    public String getEnderecoSoc() {
        return endereçoSoc;
    }

    public long getTelefoneSoc() {
        return telefoneSoc;
    }

    public BigDecimal getCpfSoc() {
        return cpfSoc;
    }

    public String getDataDeAdesaoSoc() {
        return dataDeAdesaoSoc;
    }


}
