package com.company.model;

public class Pisica extends Animal{

    private String culoare;

    public Pisica(String nume,String tip,int varsta,String culoare){
        super(nume,"pisica",varsta);
        this.culoare=culoare;
    }

    public Pisica(String line){

        super(line);
        this.culoare=line.split(",")[3];

    }

    public String getCuloare() {
        return this.culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String descrierePisica(){
        String text=super.descriereAnimal();
        text+="Culoarea este : " + culoare + "\n" ;
        return text;
    }
    @Override
    public String toSave(){
        String text=super.toSave();
        text+="," + culoare;
        return  text;
    }
}
