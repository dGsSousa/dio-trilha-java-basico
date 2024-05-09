public class ContaTerminal {
    public static void main(String[] args) {
        
        String nomeCliente = args [0];
        String agencia = args [1];
        int numeroAgencia = Integer.valueOf(args[2]);
        double saldo = Double.valueOf(args[3]);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
