package controllers;

import  models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona [] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria (Persona[] personas){
        this.pantalla = new ShowConsole();
        this.people = personas;
        pantalla.showMessage("Metodos de busqueda binaria");
    }

    public int findPersonByCode (int code){
        int bajo=0;
        int alto=people.length-1;
        while(bajo<=alto){
            int central=bajo+(alto-bajo)/2;
            if(people[central].getCode()==code){
                return central;// aqui el return si se cumple la condicion termina el while ya no sigue a lo demas abajo
            }
            if(people[central].getCode()<code){
                bajo=central+1;
            }else{
                alto=central-1;
            }

        }
        return -1;

    }

    

    public void showPersonByCode(){
        int codeToFind= pantalla.getCode();
        int indexPerson=findPersonByCode(codeToFind);
        if(indexPerson==-1){
            pantalla.showMessage("No hay la persona en este codigo");
        }else{
            pantalla.showMessage("Persona con codigo"+codeToFind+"encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private void ordenarPorNombre() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    // Intercambiar personas
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    private int findPersonByName(String name) {
        ordenarPorNombre(); // Asegurar que esté ordenado antes de buscar
        int bajo = 0;
        int alto = people.length - 1;
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            String nombreCentral = people[central].getName();

            int comparacion = nombreCentral.compareToIgnoreCase(name);
            if (comparacion == 0) {
                return central;
            }
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return -1;
    }

    public void showPersonByName() {
        pantalla.showMessage("Ingrese el nombre a buscar:");
        String nombre = pantalla.getScanner().nextLine(); // Obtener nombre
        int indexPerson = findPersonByName(nombre);
        if (indexPerson == -1) {
            pantalla.showMessage("No se encontró una persona con ese nombre.");
        } else {
            pantalla.showMessage("Persona encontrada:");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }





    public void showPersonByEdad() {
        ordenarPorEdad();
        pantalla.showMessage("Ingrese la edad a buscar:");
        int edadBuscar = pantalla.getScanner().nextInt();
        
        int bajo = 0;
        int alto = people.length - 1;
        boolean encontrado = false;
    
        while (bajo <= alto) {
            int centro = bajo + (alto - bajo) / 2;
            int valorCentro = people[centro].getEdad();
    
            // Mostrar el arreglo actual
            for (int i = bajo; i <= alto; i++) {
                System.out.print(people[i].getEdad() + " | ");
            }
            System.out.println();
            pantalla.showMessage("bajo=" + bajo + "  alto=" + alto + "  centro=" + centro + "  valorCentro=" + valorCentro);
    
            if (valorCentro == edadBuscar) {
                pantalla.showMessage("--> ENCONTRADO");
                pantalla.showMessage("La persona con la edad " + edadBuscar + " es " + people[centro].getName());
                encontrado = true;
                break;
            } else if (valorCentro < edadBuscar) {
                pantalla.showMessage("--> DERECHA");
                bajo = centro + 1;
            } else {
                pantalla.showMessage("--> IZQUIERDA");
                alto = centro - 1;
            }
        }
    
        if (!encontrado) {
            pantalla.showMessage("No se encontró una persona con esa edad.");
        }
    }
    
    private void ordenarPorEdad() {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getEdad() > people[j + 1].getEdad()) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }
    



























}
