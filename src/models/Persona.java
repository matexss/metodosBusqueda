package models;

public class Persona {

    private int code;
    private String name;
    private int edad;
    public Persona(int code, String name, int edad) {
        this.code = code;
        this.name = name;
        this.edad = edad;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad>=0){
        this.edad = edad;
        }else{
            System.out.println("La edad no puede ser negativa");
            this.edad=0;
        }


    }
    @Override
    public String toString() {
        return "Persona [code=" + code + ", name=" + name + ", edad=" + edad + "]";
    }
    

    
    
}
