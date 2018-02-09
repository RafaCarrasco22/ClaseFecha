/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafecha;

/**
 *
 * @author Rafael
 */
public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    private Integer N;
    
    public Integer getAnio(){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
            System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");
        
        return anio;
    }
    public void setAnio(Integer anio){
        this.anio = anio;
        
    }
    public Integer valAnio(){
        if(anio<1){
            return -1;
        }else{
            return 0;
        }
    }
    public Integer getMes(){
        return mes;
    }
    public void setMes(Integer mes){
        this.mes = mes;
    }
    public Integer valMes(){
        if(mes<1 || mes >12){
            return -1;
        }else{
            return 0;
        }
    }
    public Integer getDia(){
        return dia;
    }
    public void setDia(Integer dia){
        this.dia = dia;
    }
    public Integer getN(){
        return N;
    }
    public void setN(Integer N){
        this.N = N;
    }
    public Integer valDia(){
        if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&dia<=31){
            return 0;
        }else if((mes==4||mes==6||mes==9||mes==11)&&dia<=30){
            return 0;
        }else if(mes==2){
            if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))&&dia<=29){
                return 0;
            }else if(((anio % 4 != 0) && ((anio % 100 == 0) || (anio % 400 != 0)))&&dia<29){
                return 0;
            }else{
                return -1;
            }
        }else
            return -1;
    }
    public void aumentar(){
        if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10){
            if(dia<=30){
                dia+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
            else{
                dia=1;
                mes+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }else if(mes==4||mes==6||mes==9||mes==11){
           if(dia<30){
                dia+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
            else{
                dia=1;
                mes+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            } 
        }else if(mes == 12){
            if(dia<31){
                dia+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }else{
                dia=1;
                mes=1;
                anio+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }else if((mes==2)&&((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
            if(dia<29){
                dia+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }else{
                dia=1;
                mes+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }else{
            if(dia<28){
                dia+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }else{
                dia=1;
                mes+=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }
    }
    public void reducir(){
        if(mes==1||mes==2||mes==4||mes==6||mes==8||mes==9||mes==11){
            if(dia>1){
                dia-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
            else{
                dia=31;
                if(mes==1){
                    mes=12;
                    anio-=1;
                }else{
                    mes-=1;}
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }else if(mes==5||mes==7||mes==10||mes==12){
           if(dia>1){
                dia-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
            else{
                dia=30;
                mes-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            } 
        }else if((mes==3)&&((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
            if(dia>1){
                dia-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }else{
                dia=29;
                mes-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }else{
            if(dia>1){
                dia-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }else{
                dia=28;
                mes-=1;
                //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
            }
        }
        //System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
    }
    public void nuevaFecha(){
        System.out.println("La nueva fecha es: "+dia+"/"+mes+"/"+anio);
    }
    public void reducirN(){
        for(int i=0;i<5;i++){
            reducir();
            //nuevaFecha();
        }
    }
    public void aumentaN(){
        for(int i=0;i<5;i++){
            aumentar();
            //nuevaFecha();
        }
    }
}
