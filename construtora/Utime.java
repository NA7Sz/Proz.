package construtora;
public class Utime {
    public static void main(String[] args) {
        Time selecoes;
        selecoes = new Time(
        "brasil",
        "espanha",
        "europa",
        "mexiacano",
        "arabia",
        "noruega",
        "angola",
        "china",
        "japao",
        "escocia");

        
        System.out.println("brasil: " + selecoes.brasil);
        System.out.println("espanha: " +selecoes.espanha);
        System.out.println("europa: " + selecoes.europa);
        System.out.println("mexicano: " + selecoes.mexicano);
        System.out.println("arabia: " + selecoes.arabia);
        System.out.println("noruega: " + selecoes.noruega);
        System.out.println("angola: " + selecoes.angola);
        System.out.println("china: " + selecoes.china);
        System.out.println("japao: " + selecoes.japao);
        System.out.println("escocia: " + selecoes.escocia);
    }
}