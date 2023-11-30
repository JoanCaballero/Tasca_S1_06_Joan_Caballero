package org.example;

public class NoGenericMethods {

    Persona persona1, persona2, persona3;

    public NoGenericMethods(Persona p1, Persona p2, Persona p3){
        persona1 = p1;
        persona2 = p2;
        persona3 = p3;
    }

    public Persona getPersona1() {
        return persona1;
    }

    public void setPersona1(Persona persona1) {
        this.persona1 = persona1;
    }

    public Persona getPersona2() {
        return persona2;
    }

    public void setPersona2(Persona persona2) {
        this.persona2 = persona2;
    }

    public Persona getPersona3() {
        return persona3;
    }

    public void setPersona3(Persona persona3) {
        this.persona3 = persona3;
    }
}
