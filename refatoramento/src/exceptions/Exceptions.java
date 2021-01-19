package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    Scanner input = new Scanner(System.in);

    public int integerInput() {
        while(true) {
            try {
                return input.nextInt();
            }
            catch(InputMismatchException ime) {
                input.next();
                System.out.println("Incompatibilidade de entrada.");
                System.out.println("Por favor, digite um numero inteiro.");
            }
        }
    }

    public String statusInput() {
        while(true) {
            try {
                String status = input.nextLine();
                if(!(status.equalsIgnoreCase("em elaboracao"))) {
                    throw new StatusException(status);
                }
                return status;
            }
            catch(StatusException se) {
                System.out.println("Status negado, so sao aceitos projetos EM ELABORACAO");
            }
        }
    }

    public int toInteger(String info) {
        while(true) {
            try {
                return Integer.parseInt(info);
            }
            catch (NumberFormatException nfe) {
                System.out.println("Excecao de formato numerico.");
                System.out.println("A string nao pode ser convertida em um inteiro.");
                System.out.println("Agenda Invalida.");
                return -1;
            }
        }
    }
}