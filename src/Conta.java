public class Conta {
    private Cliente cliente;
    private int numero;
    private String agencia;
    private double saldo;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setAgencia(String agencia) {
        String primeiraParte = agencia.substring(0, agencia.length()-1);
        String segundaParte = agencia.substring(agencia.length()-1, agencia.length());

        this.agencia = primeiraParte + "-" + segundaParte;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public int getNumero() {
        return numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public double getSaldo() {
        return saldo;
    }
}