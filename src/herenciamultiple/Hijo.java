
package herenciamultiple;

public class Hijo extends Padre implements Madre, Hermano, Tio {
    private String nombre;
    private double billetera;
    private Celular celular;
    private Auto auto;
    
    public Hijo(String nombre, Celular celular, Auto auto) {
        this.nombre = nombre;
        this.celular = celular;
        this.auto = auto;
    }
    
    public void addCelular(String compania, int numero, int saldo) {
        celular = new Celular(compania,numero,saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public String getMamaNombre() {
        return Madre.nombre;
    }
    
    public int getFortuna() {
        return fortuna;
    }

    public String getApellido() {
        return apellido;
    }

    public Casa getCasa() {
        return casa;
    }
    
    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un auto de un amigo!");
    }
    
    @Override
    public void cantar() {
        super.cantar();
        System.out.println(" y asi canta "+nombre);
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como a mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        return nrosuerte;
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return 2;
    }

    @Override
    public void heredarDinero(double money) {
        billetera+=money;
        System.out.println("MSJ tio Lucas: disfruta la herencia Addams, sumas "+billetera+" dolaritos");
    }
}
