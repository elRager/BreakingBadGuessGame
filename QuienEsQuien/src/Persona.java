/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dague
 */
public class Persona {
        
    private String nombre;
    private boolean hombre;
    private boolean mujer;
    private boolean moreno;
    private boolean rubio;
    private boolean calvo;
    private boolean gafas;
    private boolean corbata;
    private boolean barba;
    private boolean sombrero;
    private boolean cuello;
        
    public Persona (String nombre, boolean hombre, boolean mujer, boolean moreno, boolean rubio, boolean calvo, boolean gafas, boolean corbata, boolean barba, boolean sombrero, boolean cuello) {
        this.nombre = nombre;
        this.hombre = hombre;
        this.mujer = mujer;
        this.moreno = moreno;
        this.rubio = rubio;
        this.calvo = calvo;
        this.gafas = gafas;
        this.corbata = corbata;
        this.barba = barba;
        this.sombrero = sombrero;
        this.cuello = cuello;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre() {
        this.nombre = nombre;
    }
    
    public boolean isHombre() {
        return hombre;
    }

    public void setHombre(boolean hombre) {
        this.hombre = hombre;
    }

    public boolean isMujer() {
        return mujer;
    }

    public void setMujer(boolean mujer) {
        this.mujer = mujer;
    }

    public boolean isMoreno() {
        return moreno;
    }

    public void setMoreno(boolean moreno) {
        this.moreno = moreno;
    }

    public boolean isRubio() {
        return rubio;
    }

    public void setRubio(boolean rubio) {
        this.rubio = rubio;
    }

    public boolean isCalvo() {
        return calvo;
    }

    public void setCalvo(boolean calvo) {
        this.calvo = calvo;
    }

    public boolean isGafas() {
        return gafas;
    }

    public void setGafas(boolean gafas) {
        this.gafas = gafas;
    }

    public boolean isCorbata() {
        return corbata;
    }

    public void setCorbata(boolean corbata) {
        this.corbata = corbata;
    }

    public boolean isBarba() {
        return barba;
    }

    public void setBarba(boolean barba) {
        this.barba = barba;
    }
    
    public boolean isSombrero() {
        return sombrero;
    }

    public void setSombrero(boolean sombrero) {
        this.sombrero = sombrero;
    }
    
    public boolean isCuello() {
        return cuello;
    }

    public void setCuello(boolean cuello) {
        this.cuello = cuello;
    }
}
