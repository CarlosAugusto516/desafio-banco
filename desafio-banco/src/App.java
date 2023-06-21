public class App {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Carlos Augusto");
        
        Conta cc = new ContaCorrente(cliente);

        Conta cp = new ContaPoupanca(cliente);

        cc.imprimirExtrato();

        cc.depositar(50);

        cc.transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
    
}
