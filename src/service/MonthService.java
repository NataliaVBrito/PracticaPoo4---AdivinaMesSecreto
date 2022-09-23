package service;

import entity.MonthEntity;
import java.util.Scanner;

public class MonthService {

    public MonthEntity createMonths() {
        String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String secretMonth = months[(int)(Math.random()*11)];
        System.out.println(secretMonth);

        return new MonthEntity(months, secretMonth);
    }

    public void guessTheMonth(MonthEntity month) {
        Scanner read = new Scanner(System.in);

        System.out.println("¿Listo para jugar?");
        System.out.println("Adivina el Mes Secreto, tienes 3 intentos");

        int trys = 0;
        String reply;

        System.out.println("Ingrese el nombre de un mes en minusculas");
        reply = read.next();
        reply = reply.toLowerCase();
        trys++;

        while (trys < 3 && !reply.equals(month.getSecretMonth())) {
            System.out.println("Intento nro " + trys);
            System.out.println("Intenta nuevamente");
            reply = read.next();
            reply = reply.toLowerCase();
            trys++;
        }

        if (reply.equals(month.getSecretMonth())) {
            System.out.println("WOW, HAS ADIVINADO");
            System.out.println("El mes era " + month.getSecretMonth());
        } else {
            System.out.println("Te has quedad sin intentos, ¡buena suerte la proxima!");
        }
    }

}
