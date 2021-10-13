import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Acervo extends Livro
{
    public Acervo(String nome, String autor, int nPag, int qtdCopia, int id)
    {
       super(nome, autor, nPag, qtdCopia, id);
    }
    
    public void cadastrarAcervo () throws IOException
    {
        FileWriter arq = new FileWriter("C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\java\\acervo.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
        
        System.out.println("Codgo do Livro");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt(); 
        gravarArq.printf("%d ", id);
        
        System.out.println("Nome do Livro");
        sc.nextLine();
        String nome = sc.nextLine();
        gravarArq.printf("%s ", nome);
        
        System.out.println("Nome do autor");
        String autor = sc.nextLine();
        gravarArq.printf("%s ", autor);
        
        System.out.println("Nº Pagina do Livro");
        int nPag = sc.nextInt();
        gravarArq.printf("%d ", nPag);
        
        gravarArq.printf("\r\n");
        
        arq.close();
    }
    
    public void mostrarAcervo() throws IOException 
    {
        Scanner ler = new Scanner(System.in);
        
        String nome = "C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\java\\acervo.txt";
        
        try {
          FileReader arq = new FileReader(nome);
          BufferedReader lerArq = new BufferedReader(arq);
    
          String linha = lerArq.readLine(); 
          while (linha != null) {
            System.out.printf("%s\n", linha);
    
            linha = lerArq.readLine(); 
          }
    
          arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
              e.getMessage());
        }

    }
}
