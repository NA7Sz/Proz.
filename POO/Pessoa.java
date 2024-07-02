
public class Pessoa {

    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa();
        Pessoa p1 = new Pessoa();

        p.nome = "Nicolas Alves Cardoso ";
        p.idade = 25;
        p.renda = 19890;
        p.cpf = "543.222.958";
        p.peso = (float) 65;
        p.endereço = "Rua Antonio Vieira de Lima";
        p.altura = (float) 1.74;
        p.rg = "63.543.465.7";
        p.bairro = "Jardim Nélia";
        p.telefone = "11.965985375";
        p.cidade = "São Paulo";
        p.casa = (int) 8;
        p.complemento = "Próximo a rosquinha do Alan";

        System.out.println("nome: " + p.nome);
        System.out.println("idade: " + p.idade);
        System.out.println("renda: " + p.renda);
        System.out.println("cpf: " + p.cpf);
        System.out.println("peso: " + p.peso);
        System.out.println("altura: " + p.altura);
        System.out.println("rg: " + p.rg);
        System.out.println("bairro: " + p.bairro);
        System.out.println("telefone: " + p.telefone);
        System.out.println("casa: " + p.casa);
        System.out.println("complemento: " + p.complemento);

    }
    private String nome;
    private int idade;
    private int renda;
    private String cpf;
    private float peso;
    private String endereço;
    private float altura;
    private String rg;
    private String bairro;
    private String telefone;
    private String cidade;
    private int casa;
    private String complemento;

}
