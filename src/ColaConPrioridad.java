/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zara
 */
public class ColaConPrioridad {
    protected int ini;
    protected int fin;
    protected Prioridad[] vector;
    
    public ColaConPrioridad(int tam){
        vector = new Prioridad[tam];
        ini = -1;
        fin = -1;
    }
    public boolean eliminar(){
        if(ColaEstaVacia() == true){
            return false;
        }
        if(HaySoloUnDato()==true){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    public boolean insertar(Prioridad dato){
        if(ColaEstaLlena() == true){
            return false;
        }
        fin++;
        vector[fin] = dato;
        if(fin >= 1){
            Acomodar(dato);
        }
        if(ini == -1){
            ini = 0;
        }
        return true;
    }
    public void Acomodar(Prioridad dato){
        Prioridad t;
        for(int i=fin-1; i>-1; i--){
            if(dato.getNivel() > vector[i].getNivel()){
                t = vector[i];
                vector[i] = dato;
                vector[i+1] = t;
            }
        }
    }
    
    public boolean ColaEstaVacia(){
        return ini == 1 && fin == -1; 
    }
    public boolean ColaEstaLlena(){
        return fin == vector.length-1;
    }
    public boolean HaySoloUnDato(){
        return ini == fin; 
    }
    public Prioridad getValor(int pos){
        return vector[pos]; 
    }
    public void setVector(Prioridad[] vector) {
        this.vector = vector;
    }

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
}
