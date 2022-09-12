public class Main {
    public static void main(String[] args) {
        /*Persona Instance*/
        Persona persona = new Persona();
        /*Set Persona values*/
        persona.setNombre("Sebastián Ochoa");
        persona.setEdad(25);
        persona.setTelefono(995676593);
        /*Show in screen*/
        System.out.println("Estudiante: "+persona.getNombre());
        System.out.println("Edad: "+ persona.getEdad());
        System.out.println("Contacto: "+persona.getTelefono());



    }
}