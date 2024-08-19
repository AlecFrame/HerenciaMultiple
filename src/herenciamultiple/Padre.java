
package herenciamultiple;

public class Padre {
    protected String nombre, apellido;
    protected Casa casa;
    protected Auto auto;

    private void construirCasa() {
        casa = new Casa("centro. (2)pisos");
    }
    
    private void comprarAuto() {
        auto = new Auto("Ford Focus gris","AE678QZ");
    }
    
    public Padre() {
        nombre = "Papa";
        apellido = "Lopez";
        comprarAuto();
        construirCasa();
    }
    
    public void cantar() {
        System.out.print("Asi canta tu padre, Don "+apellido);
    }
}
