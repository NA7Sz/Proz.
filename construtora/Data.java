package construtora;

public class Data {
    public static void main(String[] args) {
        NewData d1 = new NewData(2,9,1025);
        NewData d2 = new NewData(2,6,7);
        System.out.println (d1.dia + "/"+ d1.mes + "/" + d1.ano);
        System.out.println (d2.dia + "/"+ d2.mes + "/" + d2.ano);

    }
    
}