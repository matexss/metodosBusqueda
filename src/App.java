import controllers.MetodosBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) {

        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Ana");
        personas[1] = new Persona(102, "Luis");
        personas[2] = new Persona(103, "María");
        personas[3] = new Persona(104, "Pedro");
        personas[4] = new Persona(105, "Lucía");
        personas[5] = new Persona(106, "Carlos");
        personas[6] = new Persona(107, "Sofía");
        MetodosBusqueda mB = new MetodosBusqueda(personas);

    }

    }
