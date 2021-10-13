import java.util.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LivroEmprestado extends Livro
{  
    private String dataInicio;
    private String dataFinal;
    private int locador;
    private boolean atraso;
    
    public LivroEmprestado (String nome, String autor, int nPag, int qtdCopia, int id,String dataInicio, String dataFinal, int locador, boolean atraso)
    {
        super(nome, autor, nPag, qtdCopia, id);
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.locador = locador;
        this.atraso = atraso;
        
    }
    
    public void cadastro () throws IOException
    {
        FileWriter arq = new FileWriter("C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\java\\biblioteca.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
  
        System.out.println("Codgo do Livro");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt (); 
        gravarArq.printf("%d ", id);
        
               
        System.out.println("Nº Pagina do Livro");
        int nPag = sc.nextInt ();
        gravarArq.printf("%d ", nPag);
        
        System.out.println("Nº de Copias do Livro");
        int qtdCopia = sc.nextInt ();
        gravarArq.printf("%d ", qtdCopia);
        
        System.out.println("Id do Locador");
        int locador = sc.nextInt ();
        gravarArq.printf("%d ", locador);
        
        System.out.println("Nome do Livro");
        String nome = sc.nextLine ();
        gravarArq.printf("%s ", nome);
        
        System.out.println("Nome do autor");
        String autor = sc.nextLine ();
        gravarArq.printf("%s ", autor);

        gravarArq.printf("\r\n");
        
        arq.close();
         
    }
    
    public void emprestimo ()
    {
        System.out.println("Data do Emprestimo");
        Scanner sc = new Scanner(System.in);
        String dataInicio = sc.nextLine ();
        
        System.out.println("Data devolução");
        String dataFinal= sc.nextLine ();
    }
    
    public void atraso (boolean atraso)
    {
        atraso = true;
    }
    
}
