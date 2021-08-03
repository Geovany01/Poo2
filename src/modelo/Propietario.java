
package modelo;

public class Propietario extends Persona{
    private String nit;
    private String cui;
    public Propietario() {}

    public Propietario(String nit, String cui, String nombres, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        super(nombres, apellidos, direccion, telefono, fechaNacimiento);
        this.nit = nit;
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }
    @Override
    public void agregar() {
        System.out.println("Nit: " + getNit());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("______________________");
    }
}
