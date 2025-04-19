
import controllers.MetodosBusquedaBinaria;
import models.Persona;

public class App {
    public static void main(String[] args) {

        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Ana",4);
        personas[1] = new Persona(102, "Luis",76);
        personas[2] = new Persona(103, "María",6);
        personas[3] = new Persona(104, "Pedro",5);
        personas[4] = new Persona(105, "Lucía",5);
        personas[5] = new Persona(106, "Carlos",34);
        personas[6] = new Persona(107, "Sofía",55);
       

//        MetodosBusqueda mB = new MetodosBusqueda(personas);

        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        mBB.showPersonByCode();
        mBB.showPersonByName();
        mBB.showPersonByEdad();

    }

    }
