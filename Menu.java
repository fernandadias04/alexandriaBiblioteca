import java.util.*;

public class Menu
{
    
   
    public Menu()
    {
        int num; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Livraria de Alexandria");
        System.out.println("Escolha uma Opção");
        System.out.println("1.Emprestimo");
        System.out.println("2.Devolução");
        System.out.println("3.Cadastro no Acervo");
        System.out.println("4.Vizualiar Acervo");
        
        num = sc.nextInt();
        
        switch (num){
            case 1:
                LivroEmprestado.cadastro();
                break;    
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
