package atividades.q1;

public class App {
    static void main() {

                System.out.println("=== ContaCorrente ===");
                ContaCorrente cc = new ContaCorrente("Ana", "0001", "12345-6", 1000.0, 200.0);
                cc.depositar(50);          // saldo = 150
                cc.sacar(300);             // usa parte do cheque especial (150 + 200 = 350 disponível)
                cc.sacar(500);            // deve falhar, passa do limite

                System.out.println();

                System.out.println("=== ContaPoupanca ===");
                ContaPoupanca cp = new ContaPoupanca("Bruno", "0002", "65432-1", 1000.0, 0.01);
                cp.depositar(100);         // valor inválido
                cp.aplicarRendimento();    // aplica 0,5% sobre 1000
                cp.sacar(1000);            // deve falhar, não tem cheque especial
            }
        }
