package construtora;

public class Triangulo {

    public static void main(String[] args) {

        TrianguloData t = new TrianguloData(25f,20f);

        float area = (t.base * t.altura) / 2;

        System.out.println("area: " + area);


        


    
    }
}