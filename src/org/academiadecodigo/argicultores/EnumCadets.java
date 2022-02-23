package org.academiadecodigo.argicultores;


public enum EnumCadets {
    SIMAO("simao.jpg"),
    JOAOA("joaoa.jpg"),
    ANA("ana.jpg"),
    FRANCISCO("francisco.jpg"),
    SARA("sara.jpg"),
    VALENTIM("valentim.jpg"),
    JOAOM("joaom.jpg"),
    CAMILA("camila.jpg"),
    JOAOC("joaoci.jpg"),
    NUNOS("nunos.jpg"),
    GUSTAVO("gustavo.jpg"),
    PEDROCI("pedroci.jpg"),
    MAURO("mauro.jpg"),
    FILIPEI("filipe.jpg"),
    MARIO("mario.jpg"),
    GONCALO("goncalo.jpg"),
    TERESA("teresa.jpg"),
    PAULO("paulo.jpg"),
    DIOGO("diogo.jpg"),
    ZE("ze.jpg"),
    RODRIGO("rodrigo.jpg"),
    NUNOT("nunot.jpg"),
    IEVGENNI("ievgenii.jpg"),
    FILIPEII("filipeii.jpg"),
    PEDROC("pedrocii.jpg"),
    PEDROS("pedros.jpg"),
    VALTER("valter.jpg"),
    ADLER("adler.jpg"),
    IGOR("igor.jpg"),
    PEDROCII("pedrociii.jpg"),
    JAN("jan.jpg");

    private String img;

    EnumCadets(String img) {
        this.img=img;
    }

    public String getImg() {
        return img;
    }
}
