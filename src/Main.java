import Control.cadastroControl;
import DAO.contaEspecial;
import DAO.contaPoupanca;
import View.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<contaEspecial> cE= new ArrayList<>();
        ArrayList<contaPoupanca> cP= new ArrayList<>();
        cadastroControl cC = new cadastroControl();
        int op = -1;
        while(op!=0) {
            menu m = new menu();
            op = m.menuInicial();
            if(op==1){
                op=m.menuTipoDeConta();
                if(op==1){
                    cE= cC.addNovaCE(cE,m.menuCadastroCE());
                }else if(op==2){
                    cP= cC.addNovaCP(cP,m.menuCadastroCE());
                }
            }
        }

    }
}
