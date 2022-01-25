package com.company.controller;

import com.company.model.Animal;
import com.company.model.Caine;
import com.company.model.Pisica;
import com.company.model.Pitbul;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Animal>listaAnimale;


    public Controller(){
        listaAnimale=new ArrayList<>();
        load();

    }

    public void load(){
        try{

            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\RecapitulareMostenire\\src\\com\\company\\source\\animal.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                switch (line.split(",")[1]){
                    case "pisica":
                        this.listaAnimale.add(new Pisica(line));
                    break;
                    case "caine" :
                        if(line.split(",")[3].equals("pitbul")){

                            this.listaAnimale.add(new Pitbul(line));
                        }
                        break;



                }
            }
        }catch (Exception e){

        }


    }

    public String toSaveAnimal(){
        String text="";
        for(Animal animal:listaAnimale){
            text+=animal.toSave()+ "\n";
        }
        return text;
    }

    public void saveAnimal() {
        File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\RecapitulareMostenire\\src\\com\\company\\source\\animal.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(toSaveAnimal());
            printWriter.close();

        } catch (Exception e) {

        }
    }


    //o functie care arata cati pitbuli sunt

    public int nrPitbuli(){
        int cont=0;
        for(Animal animal : listaAnimale){
            if(animal instanceof Pitbul){
                cont++;
            }
        }
        return cont;
    }

    //o functie de afisare

    public void afisareAnimal() {
        for (Animal animal : listaAnimale) {
            if (animal instanceof Pisica) {
                System.out.println(((Pisica) animal).descrierePisica());
            }
        }
    }

    // o functie care afiseaza nr pisici


    public int nrPisici(){
        int cont=0;
        for(Animal animal : listaAnimale){
            if(animal instanceof Pisica){
                cont++;
            }
        }
        return cont;
    }

    public int nrCaini(){
        int cont=0;
        for(Animal animal : listaAnimale){
            if(animal instanceof Caine){
                cont++;
            }
        }
        return cont;
    }
    public void addAnimal(Animal animal){
        listaAnimale.add(animal);
    }

    //verificam daca exista animalul

    public boolean existDog(String nume,int varsta,String rasa){
        for(Animal animal: listaAnimale){
            if(animal.getNume().equals(nume) && animal.getVarsta()==varsta && ((Caine)(animal)).getRasa().equals(rasa)){
                return true;
            }
        }
        return false;
    }

    public Animal getByName(String  name){
        for(Animal animal:listaAnimale){
            if(animal.getNume().equals(name)){
                return animal;
            }
        }
        return null;
    }
/*
    public boolean updateAnimal(Animal animal){

        Animal animal1= getByName(animal.getNume());
        if(animal instanceof Pisica){




        }
    }*/




}
