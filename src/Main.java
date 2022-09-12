public class Main {
    public static void main(String[] args) {
        //Cliente Instance
        Cliente client = new Cliente();
        //Set client values
        client.setNombre("Sebastian Ochoa");
        client.setEdad(25);
        client.setTelefono(995676593);
        client.setCredito(250);
        //Show on screen
        System.out.println("Cliente: "+client.getNombre()+"\n"+"Edad: "+client.getEdad()+"\n"+"Contacto: "+client.getTelefono()+"\n"+"Credito: "+client.getCredito());
        //Employee Instance
        Trabajador employee= new Trabajador();
        //Set employee values
        employee.setNombre("Alejandro Maldonado");
        employee.setEdad(27);
        employee.setTelefono(95686769);
        employee.setSalario(1800);
        //Show on screen
        System.out.println("Trabajador: "+employee.getNombre()+"\n"+"Edad: "+employee.getEdad()+"\n"+"Contacto: "+employee.getTelefono()+"\n"+"Salario: "+employee.getSalario());


    }
}