
public class CarroTwo {

    public static void main(String[] args) {

        Carro p;
        p = new Carro();
        Carro p1 = new Carro();

        p.nome = "Hb20";
        p.ano = 2015;
        p.cor = "Branco";
        p.modelo = "560.0";
        p.peso = (float) 180;
        p.altura = (float) 1.74;
        p.motor = "4.7";
        p.bairro = "Jardim Nélia";
        p.volante = "Courino";
        p.cidade = "São Paulo";
        p.potencia = 190;
        p.complemento = "Próximo a rosquinha da Alan";

        System.out.println("nome: " + p.nome);
        System.out.println("ano: " + p.ano);
        System.out.println("cor: " + p.cor);
        System.out.println("modelo: " + p.modelo);
        System.out.println("Peso: " + p.peso);
        System.out.println("altura: " + p.altura);
        System.out.println("motor: " + p.motor);
        System.out.println("bairro: " + p.bairro);
        System.out.println("volante: " + p.volante);
        System.out.println("potencia: " + p.potencia);
        System.out.println("complemento: " + p.complemento);
    }
}
