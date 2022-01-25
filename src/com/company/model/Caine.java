package com.company.model;

public class Caine extends  Animal{

    private String rasa;

    public Caine(String nume,int varsta,String rasa){
        super(nume,"caine",varsta);
        this.rasa=rasa;
    }

    public Caine(String line){
        super(line);
        this.rasa=line.split(",")[3];
    }

    public String getRasa() {
        return rasa;
    }

    public String descriereCaine(){
        String text=super.descriereAnimal();
        text+="Rasa este : " + rasa + "\n";
        return text;
    }

    @Override
    public String toSave(){
        String text=super.toSave()+ "," + rasa;
        return text;
    }
}
