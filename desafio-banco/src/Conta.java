public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    

    public Conta(Cliente cliente) {

        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }  

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;

    }

    @Override
    public void transferir(double valor, Conta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirDadosComuns() {
        System.out.println("TITULAR: " + this.cliente.getNome());
        System.out.println("AGENCIA: " + this.agencia);
        System.out.println("CONTA: " + this.numero);
        System.out.printf("SALDO: %.2f%n", this.saldo);
    }

}
