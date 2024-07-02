package construtora;
public class Ucarro {
    public static void main(String[] args) {
        Carro hb20;
        hb20 = new Carro(
        "Hb20",
        2015,
        "Branco",
        "560.0",
        180f,
        1.74f,
        "4.7",
        "Jardim Nelia",
        "Courino",
        "Sao Paulo",
        190,
        "Proximo a rosquinha do Alan");
        

        
        System.out.println("nome: " + hb20.nome);
        System.out.println("ano: " + hb20.ano);
        System.out.println("cor: " + hb20.cor);
        System.out.println("modelo: " + hb20.modelo);
        System.out.println("Peso: " + hb20.peso);
        System.out.println("altura: " + hb20.altura);
        System.out.println("motor: " + hb20.motor);
        System.out.println("bairro: " + hb20.bairro);
        System.out.println("volante: " + hb20.volante);
        System.out.println("potencia: " + hb20.potencia);
        System.out.println("complemento: " + hb20.complemento);
    
    }
}