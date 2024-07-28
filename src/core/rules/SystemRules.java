package core.rules;

import service.Service;

import java.util.Scanner;

public class SystemRules {
    public static void choiceFactor(String choice){
        Scanner scanner = new Scanner(System.in);

        if(choice.equals("1")){
            System.out.print(Message.QUESTİON_FOR_ONE);
            String normalPassword = scanner.nextLine();
            System.out.println("Karmaşık şifreniz: " + Service.generatePassword(normalPassword));
            System.out.println("----------------------------------------------");
            transactionContinuity();
        }
        if (choice.equals("2")){
            System.out.print(Message.QUESTİON_FOR_TWO);
            String generatedPassword = scanner.nextLine();
            System.out.println("Normal şifreniz: " + Service.checkPassword(generatedPassword));
            System.out.println("-------------------------------------------------");
            transactionContinuity();
        }
    }

    public static void transactionContinuity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(Message.CHOİCE_ONE);
        System.out.println(Message.CHOİCE_TWO);
        System.out.println(Message.MESSAGE_FOR_QUİT);
        System.out.print(Message.QUESTİON_FOR_PROCESS);
        String choice = scanner.nextLine();
        quitSystem(choice);
        choiceFactor(choice);
    }

    public static void quitSystem(String choice){
        if ("3".equals(choice)) {
            System.out.println("Program kapatılıyor...");
            System.exit(0);
        }
    }
}
