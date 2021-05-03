/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class ColaCorrimiento extends ColaConPrioridad{
    
     public ColaCorrimiento(int tam) {
        super(tam);
    }
     
    public void Corrimiento(){
        int x = 0;
        int y;
        for(y = ini; y <= fin; y ++, x++){
            vector[x] = vector[y];
        }
        ini = 0;
        fin = x-1;
    }
    
     @Override
    public boolean insertar(Prioridad dato){ 
        boolean res = super.insertar(dato);
        if(res == true){
            return res;
        }
        if(ini>0){
            Corrimiento();
            return super.insertar(dato);
        }
        return false;
    }
}
