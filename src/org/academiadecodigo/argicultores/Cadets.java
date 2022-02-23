package org.academiadecodigo.argicultores;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cadets {
    private Picture c;
    public Cadets(){

    }
    public Picture cadets(int x, int y,String cadet){
        c= new Picture(x,y, cadet);
        c.draw();
        return c;
    }
}
