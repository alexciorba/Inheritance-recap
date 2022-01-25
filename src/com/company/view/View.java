package com.company.view;

import com.company.controller.Controller;
import com.company.model.Animal;
import com.company.model.Caine;
import com.company.model.Pisica;

import java.util.Scanner;

public class View {

    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();


    private void meniu() {
        System.out.println("Apasati tasta 1 pentru : a vedea toate numarul de pisici si numarul de caini");
        System.out.println("Apasati tasta 2 pentru : Caine");
        System.out.println("Apasati tasta 3 pentru a da update");
        System.out.println("Apasati tasta 4 pentru a adauga un animal");

        //apasati tasta 4 pentru a aduga un animal
        //stergeti un animal
        //update animal


    }


    public void play() {
        boolean running = true;
        while (running) {
            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere) {
                case 1:
                    afisareNr();
                    break;
                case 4:
                    adaugareAnimal();
            }
        }
    }

    private void afisareNr() {
        int n = controller.nrCaini();
        int m = controller.nrPisici();
        System.out.println("Numarul de pisici este : " + m + " " + "si numarul de caini este : " + n);
    }


    public void adaugareAnimal() {
        System.out.println("Introduceti animalul : ");
        String alegereAnimal = scanner.nextLine();
        if (alegereAnimal.equals("pisica")) {
            System.out.println("Introduceti numele pisicii : ");
            String nume = scanner.nextLine();
            System.out.println("Introduceti varsta : ");
            int varsta = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduceti culoarea : ");
            String culoare = scanner.nextLine();
            Pisica pisica = new Pisica(nume, "pisica", varsta, culoare);
            controller.addAnimal(pisica);
        } else if (alegereAnimal.equals("caine")) {
            System.out.println("Introduceti numele cainelui");
            String numeC = scanner.nextLine();
            System.out.println("Introduceti varsta cainelui");
            int varstaC = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduceti rasa cainelui");
            String rasa = scanner.nextLine();
            if (controller.existDog(numeC, varstaC, rasa)) {
                System.out.println("Ati introdus un caine care exista deja");
            } else {
                Caine caine = new Caine(numeC, varstaC, rasa);
                controller.addAnimal(caine);
            }

        }

    }

   /* public void updateAnimal(){
        String name="Pisi";
        Animal animal =controller.getByName(name);
        controller.updateAnimal(animal);
    }*/
}
