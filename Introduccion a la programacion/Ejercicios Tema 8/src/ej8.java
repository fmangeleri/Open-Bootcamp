public class ej8 {
    public static void main(String[] args) throws Exception {

        Persona miPersona = new Persona();

        miPersona.setEdad(22);
        miPersona.setNombre("Franco");
        miPersona.setTelefono(1138741081);

        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getTelefono());
        
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
