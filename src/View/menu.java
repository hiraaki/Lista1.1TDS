package View;

import DAO.contaEspecial;
import DAO.contaPoupanca;

import java.util.Scanner;

public class menu {

    public static Scanner in = new Scanner(System.in);

    public int menuInicial(){
        System.out.print("Escolha a Operação:" +
                "\n\tCriar Conta:(1)" +
                "\n\tExcluir Conta(2)" +
                "\n\tVisualizar Conta(3)" +
                "\nDigite a Opção: ");
        return in.nextInt();
    }
    public int menuTipoDeConta(){
        System.out.print("Conta Especial (1)");
        System.out.print("Conta Poupanca (2)");
        return in.nextInt();
    }
    public contaEspecial menuCadastroCE(){
        System.out.print("Nome Do Cliente: ");
        String nome = in.nextLine();
        System.out.print("\nSaldo Inicial: ");
        float saldo = in.nextFloat();
        System.out.print("\nLimite Inicial: ");
        float limit = in.nextFloat();
        contaEspecial e = new contaEspecial(nome,-1,saldo,limit);
        return e;
    }
    public contaPoupanca menuCadastroCP(){
        System.out.print("Nome Do Cliente: ");
        String nome = in.nextLine();
        System.out.print("\nSaldo Inicial: ");
        float saldo = in.nextFloat();
        System.out.print("\nDia de rendimento: ");
        int dia = in.nextInt();
        contaPoupanca p = new contaPoupanca(nome,-1,saldo,dia);
        return p;
    }
    public int menuExcluir(){
        System.out.print("Nº da Conta: ");
        int n=in.nextInt();
        System.out.print("Tipo da Conta: ");
        int tipo=in.nextInt();
        return in.nextInt();
    }


}
