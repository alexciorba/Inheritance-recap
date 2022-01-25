package com.company.model;

public class Pitbul extends Caine{

    private String stapan;

    public Pitbul(String nume,int varsta,String stapan){
        super(nume,varsta,"pitbul");
        this.stapan=stapan;

    }
    public Pitbul(String line){
        super(line);
        this.stapan=line.split(",")[3];
    }

    public String getStapan() {
        return this.stapan;
    }

    public String descrierePitbul(){
        String text=super.descriereCaine();
        text+="Stapanul este: " + stapan + "\n";
        return text;
    }

    @Override

    public String toSave(){
        String text=super.toSave()+","+ stapan;
        return text;
    }
}
