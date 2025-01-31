package secao17;

public class Funcionario {
    public String nome;
    protected double salario;
    private String senha;

    public Funcionario(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados(){
        System.out.println("Nome: "+nome+", salario "+salario+", senha: "+senha);
    }
    
    protected void aumentarSalario(double porcentagem){
        this.salario += ((this.salario * porcentagem)/100);
        System.out.println("O salario de "+nome+" agora é R$ "+salario);
    }
    
    private boolean verificarSenha(String tentativaSenha){
        return this.senha.equals(tentativaSenha);
    }

    public boolean autenticar(String tentativaSenha){
        return verificarSenha(tentativaSenha);
    }
}
