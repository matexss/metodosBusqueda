package controllers;

import views.ShowConsole;
import models.Persona;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons) {
        this.showConsole = new ShowConsole();
        this.people = persons;
    }

    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonaByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null && people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        int codeToFind = showConsole.getCode();  // Asegurate de que este método exista
        int indexPerson = findPersonaByCode(codeToFind);
        
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona encontrada:");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona con código " + codeToFind + " no encontrada.");
        }
    }

  
}