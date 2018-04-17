package Control;

import DAO.contaEspecial;

import java.util.ArrayList;
//dsadsdsa  
public class cadastroControl {
    public ArrayList<contaEspecial> addNovaCE(ArrayList<contaEspecial> contasE, contaEspecial conta){
        contasE.add(conta);
        return  contasE;
    }
}
