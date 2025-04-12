public class App {
    public static void main(String[] args) throws Exception {
            Conta p1 = new Conta("08392150376", 22331, 4000.0, true);
            Conta p2= new Conta("48092029355",331234, 1000.0, false);
            
            p1.mostrar();
            System.out.println();
            p2.mostrar();
            System.out.println();
            System.out.println();
            System.out.println("Transferindo 4000 de conta 1 para conta 2.");
            p1.transferir(p2, 4000);
           System.out.println();
           System.out.println();
            p1.mostrar();
            System.out.println();
            p2.mostrar();
        }
    }
    

