public class Main {

    public static void main(String[] args) {
        Cliente nilcelso = new Cliente();
        nilcelso.setNome("Nilcelso");

        Conta cc = new ContaCorrente(nilcelso);
        Conta cp = new ContaPoupanca(nilcelso);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }

}
