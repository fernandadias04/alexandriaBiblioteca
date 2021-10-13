import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Devolucao 
{
    public ArrayList<String> devolverLivro() throws IOException
    { 
        
        Scanner ler = new Scanner(System.in);
        
        String filePath = "C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\java\\acervo.txt";
        
        StringBuilder contentBuilder = new StringBuilder();
        
        ArrayList<String> linha = new ArrayList<>();
 
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) 
        {
            stream.forEach(s -> linha.add(s));
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
 
        return linha;
        
        

        
    }
    
    public void removerLivro ()throws IOException
    {
        
        System.out.println("Codgo do Livro para devolução");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine ();
        
        ArrayList<String> leitura = new ArrayList<>();
        ArrayList<String> escrita = new ArrayList<>();
        
        leitura = devolverLivro();
        
        
        for(String linha : leitura){ 
            
            String[] cod = linha.split(" ");
            System.out.println(cod[0]);
            
            if (!cod[0].equals(id)){
                escrita.add(linha);
            }
            
        }
        
        if(!leitura.isEmpty()){
            if (leitura.size()==escrita.size()){
                System.out.println("Emprestimo não encontrado. Favor digitar codigo valido");
            }else{
                FileWriter arq = new FileWriter("C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\java\\acervo.txt", false);
                PrintWriter gravarArq = new PrintWriter(arq);
                
                for (String linha : escrita){
                    gravarArq.printf("%s\r\n", linha);
                }
                arq.close();
            }
        }
}
}
