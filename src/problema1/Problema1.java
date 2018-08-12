/*Para essa atividade, você deverá criar aplicativo desktop que armazene em um array/lista um nome informado pelo usuario e 
permita listar todos os nomes armazenados. Cabe ao usuário do sistema decidir quando quer informar um novo nome ou listar os 
nomes armazenados. O código fonte da aplicação deverá ser armazenado em um repositório na sua conta no GitHub. Se você usar
alguma IDE (e.g., Netbeans, IntelliJ, etc), submeta o projeto criado pela IDE, contendo todas as pastas e arquivos, com exceção 
dos arquivos executáveis. Para esta atividade, você deve submeter no Moodle o link do repositório no GitHub. O professor irá 
analisar o código diretamente no GitHub. 

Adicionalmente, considere as seguintes observações:

Excepcionalmente, essa atividade é individual;
É necessário criar uma interface para interação com o usuário, mas não precisa ser uma interface gráfica, pode ser textual;
Os nomes armazenados no array/lista não precisam ser gravados em banco de dados;*/
package problema1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vinicius
 */


public class Problema1 { 

   
    
 
    public static void main(String[] args) throws IOException {
        int cont =1;
        String[] nome = new String[10];
        int i = 0;
        
        do{
        Scanner ler = new Scanner(System.in);        
        char opcaonum;        
        
        System.out.println("Selecione uma das opções");
        System.out.println("-------------------------------------");
        System.out.println("Opção 1 - Inserir nome:");
        System.out.println("Opção 2 - Lê Nomes");
        System.out.println("Opção 3 - Sair");
        System.out.println("-------------------------------------");
        opcaonum = (char)System.in.read();
        System.out.println("Solicitado: " + opcaonum);
        
        switch (opcaonum) {
            case '1':
                   System.out.println("Informe o nome: "+ (i+1));
                   nome[i] = ler.next();                                
                   
                   i++;
                  break;
            case '2':
                    for( int a=0; a < i; a++){
                        System.out.println(nome[a]);
                    }
                break;
            case '3':
                cont =0;
                 System.out.println("Obrigado...");
                break;
            default:
                 System.out.println("Opção incorreta, digite novamente");
                break;
        }

    
    }while(cont == 1);
}
}
