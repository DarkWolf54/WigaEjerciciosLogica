import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {



    public static void main (String [ ] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String numberString[] = input.split(" ");
        long inputNumbers[] = new long[numberString.length];
        for(int i = 0; i < numberString.length; i++) {
            inputNumbers[i] = Integer.parseInt(numberString[i]);
        }
        long programadores = inputNumbers[0];
        long matematicos = inputNumbers[1];
        long otros = inputNumbers[2];
        long sum = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            sum += inputNumbers[i];
        }
        long maxEquipos = sum/3;
        if(sum < 3){
            System.out.println(0);
        }
        else if(maxEquipos < Math.min(programadores,matematicos)){
            System.out.println(maxEquipos);
        }
        else {
            System.out.println(Math.min(programadores, matematicos));
        }

    }
}
