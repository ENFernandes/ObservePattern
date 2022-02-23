package org.academiadecodigo.argicultores;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import java.util.*;

public class Randamaizer {
    private Picture pic = new Picture();
    private int max = 32;
    private int random;
    private Cadets ca = new Cadets();
    private ArrayList<Picture> cadets = new ArrayList();
    private ArrayList<EnumCadets> nameCadet = new ArrayList<EnumCadets>(EnumSet.allOf(EnumCadets.class));

    public Randamaizer() {
        random = (int) Math.round(Math.random() * 0);//(max - 1) + 1);
    }

    public void addCadet() {
        int cont=0;
        int x=400;
        int y=10;
        while (nameCadet.size()>cont) {
            cadets.add(ca.cadets(x,y,nameCadet.get(cont).getImg()));
            cont++;
            if (x<1500) {
                x+=120;
            }
            else {
                x=400;
                y+=200;
            }
        }
    }

    public void play() {
        //while (cadets.size()>=1)


    }
}

