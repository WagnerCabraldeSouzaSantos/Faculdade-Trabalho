import java.util.Scanner;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int close = 0;
        int resppro;
        
        ArrayList<Socio> socioList = new ArrayList<Socio>();
        ArrayList<Filme> filmeList = new ArrayList<Filme>();
        ArrayList<Copia> copiaList = new ArrayList<Copia>();
        ArrayList<Locacao> locacaoList = new ArrayList<Locacao>();
        ArrayList<Integer> teste = new ArrayList<Integer>();

        System.out.println("Deseja inciar o programa? 1 - sim / 0 - não");

        int resp = s.nextInt();


        if (resp == 0) {
            System.out.println("Programa encerrado!");

        } else {

            do {
                System.out.printf("\nEscolha uma opção:\n\n1-Cadastrar socio\n2-Cadastrar filme\n3-Cadastrar copia\n4-Cadastrar locação\n5-Consultar locação\n6-consultar socio\n7-Consultar quantidade de copias\n8-Encerrar programa\n");
                resppro = s.nextInt();

                switch (resppro) {
                    case 1:

                        Socio novoSocio = new Socio();

                        System.out.println("Escreva o nome do socio:");
                        String nome = s2.nextLine();
                        novoSocio.setNomeSoc(nome);

                        System.out.println("Escreva o RG do socio:");
                        BigDecimal rg = s.nextBigDecimal();
                        novoSocio.setRgSoc(rg);

                        System.out.println("Escreva o CPF do socio:");
                        BigDecimal cpf = s.nextBigDecimal();
                        novoSocio.setCpfSoc(cpf);

                        System.out.println("Escreva o Telefone do socio:");
                        long telefone = s.nextLong();
                        novoSocio.setTelefoneSoc(telefone);

                        System.out.println("Escreva o Endereço do socio:");
                        String endereco = s2.nextLine();
                        novoSocio.setEnderecoSoc(endereco);

                        System.out.println("Escreva a data de adesao do socio:");
                        String data = s2.nextLine();
                        novoSocio.setDataDeAdesaoSoc(data);

                        socioList.add(novoSocio);

                        System.out.println("Cadastro realizado com sucesso!");
                        close = 0;

                        break;

                    case 2:


                        Filme novoFilme = new Filme();

                        System.out.println("Informe o título do filme:");
                        String titulo = s2.nextLine();
                        novoFilme.setFilTitulo(titulo);

                        System.out.println("Informe a duração do filme:");
                        int duracao = s.nextInt();
                        novoFilme.setFilDuracao(duracao);

                        System.out.println("Informe o ano de lançamento do filme:");
                        int anoLancamento = s.nextInt();
                        novoFilme.setFilAnoLancamento(anoLancamento);

                        System.out.println("Informe o formato do filme:");
                        String formato = s2.nextLine();
                        novoFilme.setFilFormato(formato);

                        int res = 0;

                        do {
                            System.out.println("Informe o nome do principal ator/atriz que participou do filme:");
                            String autor = s2.nextLine();
                            novoFilme.setNomeAtores(autor);
                            System.out.println("deseja informar um novo ator/atriz principal: 1 - sim / 0 - não");
                            res = s.nextInt();

                        } while (res == 1);


                        filmeList.add(novoFilme);
                        break;

                    case 3:
                        int filmeEncontrado=0;

                        if (filmeList.isEmpty() == true) {
                            System.out.println("Sem filmes cadastrados. Cadastre pelo menos um filme!");

                        } else {
                                                    
                            for(Filme fil : filmeList){
                                    System.out.println(fil.getFilTitulo());      
                            }
                            System.out.println("Digite o nome do filme do qual deseja cadastrar uma copia");
                            String nomeFilme = s2.nextLine();

                            for (Filme f : filmeList) {

                                if (f.getFilTitulo().equalsIgnoreCase(nomeFilme)) {

                                    System.out.println("Digite a quantidade de copias que deseja cadastrar");
                                    int qtdcop = s.nextInt();
                                    filmeEncontrado=1;
                                    
                                    for (int j = 0; j < qtdcop; j++) {
                                        Copia novaCopia = new Copia(f);
                                        copiaList.add(novaCopia);
                                    }

                                }

                            }
                            if(filmeEncontrado == 1){
                                System.out.printf("\nCopias cadastradas com sucesso\n");
                            }else{
                                System.out.printf("\nFilme nao encontrado!Nao foi possivel realizar o cadastro das copias\n");
                            }
                        }
                        break;

                    case 4:

                        BigDecimal consultRgSoc;
                        int i = 0;
                        int achou = 0;
                        int j = 0;
                        System.out.println("Digite o RG do Socio:");
                        
                        consultRgSoc = s.nextBigDecimal();

                        for (Socio soci : socioList) {

                            if (soci.getRgSoc().equals(consultRgSoc)) {

                                System.out.println("Digite a quantidade de copias que serão locadas");
                                System.out.println();
                                
                                int quant = s.nextInt();
                                
                                if (quant>copiaList.size()){
                                    System.out.println("numero desejado maior que o número disponível de copias");
                                
                                }else{
                                    int[] codCop = new int[quant];
                                    int g=0;
                                    //controlador de repetição de codigos
                                    int CRDC =1;

                                    for(Copia copy : copiaList){
                                        
                                        if(teste.size() > 0){
                                            for(g =0;g < teste.size();g++){
                                                if( copy.getCodigo() ==( teste.get( g ) )){
                                                    CRDC=0;
                                                    break;
                                                }else{
                                                    CRDC=1;
                                                    
                                                    
                                                }
                                            }
                                        }
                                            if(teste.size() >0 ){
                                                if(CRDC==1){
                                                    CRDC=0;
                                                   System.out.println(copy.getCodigo() + " " + copy.getTitulo());
                                                }
                                        }else{
                                            System.out.println(copy.getCodigo() + " " + copy.getTitulo());
                                        }            
                                    }
                                    
                                    System.out.println();
                                
                                    for (i = 0; i < quant; i++) {
                                    System.out.printf("\nDigite o código da copia %d: ", i + 1);
                                    codCop[i] = s.nextInt();
                                    teste.add(codCop[i]);
                                    }


                                    Locacao novaLocacao = new Locacao(codCop, soci);
                                    locacaoList.add(novaLocacao);

                                    System.out.println("Locação efetuada com sucesso!");
                                    achou = 1;
                                    break;
                                }
                            }
                            
                        }


                        if (achou != 0) {
                            System.out.println("Socio não encontrado");
                        }

                        break;

                    case 5:

                        System.out.println("Digite o RG do socio:");
                        BigDecimal rgDoSoc = s.nextBigDecimal();

                        for (Locacao l : locacaoList) {
                            if (l.getRgSoc().equals(rgDoSoc)) {
                                System.out.println("Codigo de locação:" + l.getLocCodigo());
                                l.getCodigoCop();
                            }
                        }
                        
                        break;
                    case 6:
                    
                        if(socioList.isEmpty() == true){
                            System.out.println("Sem socios cadastrados. Cadastre pelo menos um socio!");
                        }else{

                        System.out.println("*****Lista de Socios******");

                        for (Socio so : socioList) {

                            System.out.println(so.getNomeSoc());

                        }


                        System.out.println("Informe o nome do Socio a qual deseja consultar:");
                        String consultarSocio = s2.nextLine();

                        for (Socio soc : socioList) {
                            if (soc.getNomeSoc().equalsIgnoreCase(consultarSocio)) {
                                System.out.printf("\nNome Socio:%s\nEndereço do socio:%s\nData de adesão do Socio:%s\n", soc.getNomeSoc(),soc.getEnderecoSoc(), soc.getDataDeAdesaoSoc());
                                System.out.println("Telefone do Socio:" + soc.getTelefoneSoc());
                                System.out.printf("\n");
                                System.out.println("RG do Socio:" + soc.getRgSoc());
                                System.out.printf("\n");
                                System.out.println("CPF do Socio:" + soc.getCpfSoc());
                                System.out.printf("\n");
                            }
                        }
                        
                    }


                        break;

                    case 7:

                        if (copiaList.isEmpty() == true) {
                            System.out.println("Sem copias cadastradas. Cadastre pelo menos uma copia!");
                        } else {
                            System.out.println("*****Lista de Filmes******");
                            String naoRepetirCopias="NULL";
                            for(Copia copi : copiaList){
                                if(copi.getTitulo().equalsIgnoreCase(naoRepetirCopias)){
                                    continue;
                                }else{
                                    System.out.println(copi.getTitulo());
                                    naoRepetirCopias = copi.getTitulo();
                                }
                            }

                            System.out.println("Informe o nome do filme a qual deseja consultar:");
                            String consultFilme = s2.nextLine();
                            int numCop = 0;

                            for (Copia cop : copiaList) {
                                if (cop.getTitulo().equalsIgnoreCase(consultFilme)) {
                                    numCop++;
                                }
                            }
                            System.out.println("Total de Copia do filme escolhido:" + numCop);
                        }

                        break;

                    case 8:
                        System.out.println("Fim do programa!");
                        close = 1;
                }


            }while(close != 1);

        }
        s.close();
        s2.close();
    }
}
