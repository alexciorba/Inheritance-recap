package com.company.model;

public class Animal {

    private String nume;
    private String tip;
    private int varsta;


    public Animal(String nume,String tip,int varsta){
        this.nume=nume;
        this.tip=tip;
        this.varsta=varsta;
    }

    public Animal(String line){
        this(line.split(",")[0],
                line.split(",")[1],
                Integer.parseInt(line.split(",")[2]));
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getTip() {
        return this.tip;
    }

    public String getNume() {
        return this.nume;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public String descriereAnimal(){
        String text="";
        text+="Numele este : " + nume + "\n";
        text+="Tipul este : " + tip + "\n";
        text+="Varsta este : " + varsta + "\n";
        return text;
    }

    public String toSave(){
        String text=nume+ "," + tip + "," + varsta;
        return text;
    }
}
