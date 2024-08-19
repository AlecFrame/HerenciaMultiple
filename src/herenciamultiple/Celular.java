
package herenciamultiple;

public class Celular {
    private String compania;
    private int numero,saldo;

    public Celular() {
    }
    
    public Celular(String compania, int numero, int saldo) {
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
