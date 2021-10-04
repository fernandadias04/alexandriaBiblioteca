
public class Usuario
{
    private String nome;
    private int id;
    private String endereco;
    private int tel;
    
    public Usuario(int tel, String endereco, int id, String nome )
    {
       this.nome = nome;
       this.id = id;
       this.endereco = endereco;
       this.tel = tel;
    }
    
    public void newUser(String n, int i , String e, int t  ){
        nome = n;
        id = i;
        endereco = e;
        tel = t;
        
    }

    
}
