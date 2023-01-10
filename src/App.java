import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int number = random. nextInt(10);
        System.out.printf("Tabela de multiplicação de %d\n", (number));
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", (i), (number), (i*number));
        }
    }
}