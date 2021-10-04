import java.util.*;

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
    
    public void cadastro ()
    {
        System.out.println("Codgo do Livro");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt (); 
        
        System.out.println("Nº Pagina do Livro");
        int nPag = sc.nextInt ();
        
        System.out.println("Nº de Copias do Livro");
        int qtdCopia = sc.nextInt ();
        
        System.out.println("Id do Locador");
        int locador = sc.nextInt ();
        
        System.out.println("Nome do Livro");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine ();
        
        System.out.println("Nome do autor");
        String autor = sc.nextLine ();
        
        
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
