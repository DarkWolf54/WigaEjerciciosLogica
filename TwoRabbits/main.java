import java.util.Scanner;

public class main {
    public static void main (String [ ] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputString[] = input.split(" ");
        long coordenadas[] = new long[inputString.length];
        for(int i = 0; i < inputString.length; i++) {
            coordenadas[i] = Integer.parseInt(inputString[i]);
        }
        long posX = coordenadas[0];
        long posY = coordenadas[1];
        long a = coordenadas[2];
        long b = coordenadas[3];
        long denominador = (posY - posX);
        long divisor = (a + b);
        if(denominador%divisor == 0){
            System.out.println(denominador/divisor);
        }
        else{
            System.out.println(-1);
        }
    }
}
