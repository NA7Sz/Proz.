package construtora;
public class Upessoa {
    public static void main(String[] args) {
        Pessoa pessoa1;
        pessoa1 = new Pessoa(
            "Nicolas",
            17,
            1000,
            "560.050.852.0",
            "Rua Antonio Vieira de Lima",
            70f,
            1.75f,
            "Jardim Nelia",
            "1196658653",
            "Sao Paulo",
            190,
            "Proximo a rosquinha do Alan");

            System.out.println("nome: " + pessoa1.nome);
        System.out.println("idade: " +pessoa1.idade);
        System.out.println("renda: " + pessoa1.renda);
        System.out.println("cpf: " + pessoa1.cpf);
        System.out.println("peso: " + pessoa1.peso);
        System.out.println("altura: " + pessoa1.altura);
        System.out.println("rg: " + pessoa1.rg);
        System.out.println("bairro: " + pessoa1.bairro);
        System.out.println("telefone: " + pessoa1.telefone);
        System.out.println("casa: " + pessoa1.casa);
        System.out.println("complemento: " + pessoa1.complemento);

    }
}