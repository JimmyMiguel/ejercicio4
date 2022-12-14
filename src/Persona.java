public class Persona {

    private int edad;
    private String nombre;
    private int telefono;


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad () {
        return edad;
    }

    public void setEdad( int edad){
        this.edad=edad;
    }

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(18);
        persona.setNombre("Jimmy");
        persona.setTelefono(234344431);
        System.out.println("La edad es:" + persona.getEdad());
        System.out.println("El nombre es:" + persona.getNombre());
        System.out.println("La edad es:" + persona.getTelefono());



    
}
   
}


/*Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

*/