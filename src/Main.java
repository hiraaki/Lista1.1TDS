import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static int menuInicial(){
        System.out.println("Escolha a Operaç�o:" +
                "/n/tCriar DAO.Conta:(1)" +
                "/n/tExcluir DAO.Conta(2)" +
                "/n/tAcessar DAO.Conta(3)");
        return in.nextInt();
    }

    public static void main(String[] args) {
        int op = -1;
        op=menuInicial();
    }
}
