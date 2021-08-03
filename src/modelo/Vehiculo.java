
package modelo;

abstract public class Vehiculo extends Persona{
    private String placa, chasis, serie, motor, cilindros, marca, modelo,
            linea, asientos;

    public Vehiculo() {
        
    }

    public Vehiculo(String nombres, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        super(nombres, apellidos, direccion, telefono, fechaNacimiento);
    }
    
    
    public Vehiculo(String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos) {
        this.placa = placa;
        this.chasis = chasis;
        this.serie = serie;
        this.motor = motor;
        this.cilindros = cilindros;
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.asientos = asientos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    
    protected void agregar() {
        
    }
    protected void operation() {
        
    }
}
