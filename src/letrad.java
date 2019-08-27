import java.util.Scanner;


  class Main {

        public static void main(String[] args) {
            double raio;
            double perimetro;
            double area;

            Scanner sc = new Scanner(System.in);
            System.out.println("Calcule a area, mas antes informe o raio");
            raio = sc.nextDouble();
            area = (3.14 * raio * raio);
            System.out.println("A area é: " + area);
            System.out.println("Calcule o perimetro, com o mesmo valor do raio : ");
            perimetro = sc.nextDouble();
            perimetro = (2 * 3.14 * raio);
            System.out.println("resultado final: " + perimetro);
        }

    }






