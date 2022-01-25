package com.company.controller;

import com.company.model.Animal;
import com.company.model.Caine;
import com.company.model.Pisica;
import com.company.model.Pitbul;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void testPolimorfism(){

        Caine caine=new Caine("patrocle",12,"ceva");
        Pisica pisica=new Pisica("Mitz,pisica,3,negru");
        Pitbul pitbul=new Pitbul("Pit",2,"Alex");

        Animal a=caine;
        System.out.println(a.toSave());



        a=pisica;
        System.out.println(a.toSave());

        a=pitbul;
        System.out.println(a.toSave());

    }
    @Test
     void  test(){


        Controller controller=new Controller();
        assertEquals(2,controller.nrPitbuli());


    }


    @Test
    void conversii(){


        Caine caine=new Caine("Ruffus",9,"pudel");
        Pisica pisica=new Pisica("pis","pisica",2,"bej");
        Pitbul pitbul=new Pitbul("Rex",7,"Marius");



        Animal animal=caine;



        System.out.println(((Caine)animal).descriereCaine());



    }



}