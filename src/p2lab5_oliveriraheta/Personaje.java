package p2lab5_oliveriraheta;

public class Personaje {

    private String name, poder, debilidad, universo;
    private double agilidad_fisica, agilidad_mental, fuerza, vida;
    private int bandera = 0;

    public Personaje() {
    }

    public Personaje(String name, int bandera) {
        this.name = name;
        this.bandera = bandera;
    }


    public Personaje(String name, String poder, String debilidad, String universo, double agilidad_fisica, double agilidad_mental, double fuerza, double vida) {
        this.name = name;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.agilidad_fisica = agilidad_fisica;
        this.agilidad_mental = agilidad_mental;
        this.fuerza = fuerza;
        this.vida = vida;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public double getAgilidad_fisica() {
        return agilidad_fisica;
    }

    public void setAgilidad_fisica(double agilidad_fisica) {
        this.agilidad_fisica = agilidad_fisica;
    }

    public double getAgilidad_mental() {
        return agilidad_mental;
    }

    public void setAgilidad_mental(double agilidad_mental) {
        this.agilidad_mental = agilidad_mental;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        //if (bandera != 0) {
            return name;
        //}
//        return " Poder -> " + poder
//                + "\n Debilidad -> " + debilidad
//                + "\n Universo -> " + universo
//                + "\n Agilidad Fisica -> " + agilidad_fisica
//                + "\n Agilidad Mental -> " + agilidad_mental
//                + "\n Fuerza -> " + fuerza
//                + "\n Vida -> " + vida;
    }

}
