package Control;

import DAO.contaEspecial;

import java.util.ArrayList;

public class cadastroControl {
    public ArrayList<contaEspecial> addNovaCE(ArrayList<contaEspecial> contasE, contaEspecial conta){
        contasE.add(conta);
        return  contasE;
    }
}
