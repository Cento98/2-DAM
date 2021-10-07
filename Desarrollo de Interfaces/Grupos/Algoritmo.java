import java.util.*;
public class Algoritmo {

    

    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);
        ArrayList <Alumnos> lista= new ArrayList <Alumnos>();
        int[] arrAlum=new int[15];
        int alumnos=15;
        int grup;
        
        System.out.println("Tenemos 15 alumnos");
        System.out.println("En cuantos grupos quieres separarlos?");
        grup=lector.nextInt();
        
        int total=alumnos/grup;
        if(grup!=1 && grup!=2 && grup!=3 && grup!=5){
            total++;
        }
        int total1=total;
        int aux=1;
        for(int i=1;i<=15;i++){
            Alumnos alumno=new Alumnos(i,"Alumno"+i,aux);
            lista.add(alumno);
            if(i==total){
                aux++;
                total+=total1;
            }
            if(aux>grup){
                aux--;
            }
        }

        for(int i=0;i<lista.size();i++){
            lista.get(i).tostring();
        }
    }
}
