import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            ArrayList<ModeloVeiculos> veiculos = new ArrayList<>();

            char opcao = 0;
            while(opcao != 'X'){
                System.out.println("Digite C para nova cadastro");
                System.out.println("Digite M para listar cadastros");
                System.out.println("Digite X para encerrar");
                opcao = leitura.nextLine().charAt(0);
                System.out.println("Opção selecionada: " + opcao);

                if(opcao == 'C'){

                    System.out.println("Novo cadastro");
                    ModeloVeiculos cm =new ModeloVeiculos();
                    System.out.println("Veiculo ");
                    cm.mensagem = leitura.nextLine();
                    System.out.println("Modelo do veiculo:");
                    cm.modelo = leitura.nextLine();
                    System.out.println("marca do veiculo:");
                    cm.marca = leitura.nextLine();
                    System.out.println("Placa do veiculo:");
                    cm.placa = leitura.nextLine();
                    System.out.println("Valor do veiuclo:");
                    cm.valor = leitura.nextLine();
                    System.out.println("Ano");
                    cm.ano = leitura.nextLine();
                    System.out.println("Telefone:");
                    cm.telefone = leitura.nextLine();
                    System.out.println("Endereço:");
                    cm.endereco = leitura.nextLine();
                    System.out.println("Cidade:");
                    cm.cidade = leitura.nextLine();
                    System.out.println("UF:");
                    cm.uf = leitura.nextLine();
                    JFileChooser arquivo = new JFileChooser();
                    arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    arquivo.showSaveDialog(null);
                    String caminho =arquivo.getSelectedFile().getAbsolutePath();
                    System.out.println("Arquivo da foto do veiuclo:" + caminho);
                    System.out.println("Valor Double: ");
                    cm.valorDouble = leitura.nextDouble();
                    leitura.nextLine();
                    veiculos.add(cm);


                }
                else if(opcao == 'M'){
                    System.out.println("Imprimindo conteúdo da lista");
                    for(int i = 0; i< veiculos.size(); i++){
                        veiculos.get(i).Listagem();
                    }
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
            System.out.println("Você escolheu encerrar o programa. Pressione qualquer tecla para fechar");
            leitura.nextLine();
            System.exit(0);
        }
    }

