import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Menu
{
    
   
    public static void main(String[] args) throws IOException
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
