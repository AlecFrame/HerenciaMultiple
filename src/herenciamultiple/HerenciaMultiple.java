
package herenciamultiple;

public class HerenciaMultiple {

    public static void main(String[] args) {
        
        Auto cascajo = new Auto("Renault 12","123LATA");
        Auto auto = new Auto("Ford Focus","999POWR");
        Celular celular = new Celular();
        
        Padre padre = new Padre();
        
        Hijo hijo = new Hijo("Juan Carlos",celular,cascajo);
        
        System.out.println("Papa me dejo esta casa en zona "+hijo.getCasa().getZona());
        System.out.println("Soy el hijo "+hijo.getNombre()+" y herede de mi padre su apellido: "+hijo.getApellido());
        System.out.println("Papa me dejo este auto: "+hijo.getAuto().getModelo());
        hijo.conducirAuto(auto);
        hijo.jugarFutbol();
        hijo.bailar();
        hijo.setBilletera(hijo.getFortuna());
        System.out.println("Heredaste la fortuna de "+hijo.getFortuna()+" de tu madre "+hijo.getMamaNombre()+"!! ahora tienes "+hijo.getBilletera()+" U$S !!!");
        System.out.println("SALIO EL NUMERO DE LA SUERTE "+hijo.jugarLoteria());
        hijo.cantar();
        hijo.heredarDinero(2000);
        System.out.println("Jugando al Futbol, Hoy has hecho "+hijo.hacerGoles()+" goles");
    }
    
}
