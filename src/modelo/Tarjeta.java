
package modelo;

public class Tarjeta extends Vehiculo {
    private String noTarjeta, uso;
    
    public Tarjeta() {}

    public Tarjeta(String noTarjeta, String uso, String nombres, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        super(nombres, apellidos, direccion, telefono, fechaNacimiento);
        this.noTarjeta = noTarjeta;
        this.uso = uso;
    }

    public Tarjeta(String noTarjeta, String uso, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos);
        this.noTarjeta = noTarjeta;
        this.uso = uso;
    }

    public String getNoTarjeta() {
        return noTarjeta;
    }

    public void setNoTarjeta(String noTarjeta) {
        this.noTarjeta = noTarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

        @Override
    public void agregar() {
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("Placa: " + getPlaca());
        System.out.println("chasis: " + getChasis());
        System.out.println("Serie: " + getSerie());
        System.out.println("Motor: " + getMotor());
        System.out.println("Cilindros: " + getCilindros());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Linea: " + getLinea());
        System.out.println("Asientos: " + getAsientos());
        System.out.println("______________________");
    }
    
}
