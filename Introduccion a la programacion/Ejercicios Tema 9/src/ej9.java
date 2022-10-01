public class ej9 {
    public static void main(String[] args) throws Exception {

        Cliente miCliente = new Cliente();

        miCliente.setEdad(22);
        miCliente.setNombre("Franco");
        miCliente.setTelefono(1138741081);
        miCliente.setCredito(20000);

        System.out.println("Datos de mi Cliente");
        System.out.println("Edad: " + miCliente.getEdad());
        System.out.println("Nombre: " + miCliente.getNombre());
        System.out.println("Telefono: " + miCliente.getTelefono());
        System.out.println("Credito: " + miCliente.getCredito());


        Trabajador miTrabajador = new Trabajador();

        miTrabajador.setEdad(38);
        miTrabajador.setNombre("Carlos");
        miTrabajador.setTelefono(123456789);
        miTrabajador.setSalario(150000);

        System.out.println("Datos de mi Trabajador");
        System.out.println("Edad: " + miTrabajador.getEdad());
        System.out.print("Nombre: " + miTrabajador.getNombre());
        System.out.println("Telefono: " + miTrabajador.getTelefono());
        System.out.println("Salario: " + miTrabajador.getSalario());
    }
}

class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }  
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }  
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    } 
}

