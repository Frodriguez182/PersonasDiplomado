package com.example.android.personas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void cantidad_mujeres(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",0);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);

        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));

        assertEquals(4,Metodos.cuantas_mujeres(pers));

    }

    @Test
    public void cantidad_mujeres_incorrecta(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",0);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);
        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        assertNotEquals(3,Metodos.cuantas_mujeres(pers));
    }

    @Test
    public void cantidad_hombres(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",0);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);
        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        assertEquals(3,Metodos.cuantas_hombres(pers));
   }

    @Test
    public void cantidad_hombres_incorrecto(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",0);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);
        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        assertNotEquals(2,Metodos.cuantas_hombres(pers));
    }

    @Test
    public void cales_son_hombres(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",1);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);

        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        Persona hombres[] = {p1,p3};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        ArrayList<Persona> homb = new ArrayList<>(Arrays.asList(hombres));
       

        assertEquals(homb,Metodos.cuales_hombres(pers));
    }

    @Test
    public void cales_son_hombres_incorrecto(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",1);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);

        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        Persona hombres[] = {p1};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        ArrayList<Persona> homb = new ArrayList<>(Arrays.asList(hombres));


        assertNotEquals(homb,Metodos.cuales_hombres(pers));
    }

    @Test
    public void cales_son_mujeres(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",0);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);

        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        Persona mujeres[] = {p4,p5,p6,p7};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        ArrayList<Persona> muj = new ArrayList<>(Arrays.asList(mujeres));


        assertEquals(muj,Metodos.cuales_mujeres(pers));
    }

    @Test
    public void cales_son_incorrecto(){
        Persona p1 = new Persona("1456789","Roberto","Morales",0);
        Persona p2 = new Persona("1456788","Manuel","Mejía",0);
        Persona p3 = new Persona("1456787","Sergio","Ramos",0);
        Persona p4 = new Persona("1454789","Andrea","Peña",1);
        Persona p5 = new Persona("1454389","Laura","Castro",1);
        Persona p6 = new Persona("1456989","Carmen","Rodriguez",1);
        Persona p7 = new Persona("1452989","Luz","Perez",1);

        Persona personas[]= {p1,p2,p3,p4,p5,p6,p7};
        Persona mujeres[] = {p4,p5,p6};
        ArrayList<Persona> pers = new ArrayList<>(Arrays.asList(personas));
        ArrayList<Persona> muj = new ArrayList<>(Arrays.asList(mujeres));


        assertNotEquals(muj,Metodos.cuales_mujeres(pers));
    }

}