package operaciones;
/**
 *
 * @author marco
 */
public class Operacion {
    int n1=0, n2=0, resul=0;
    
    public Operacion(){
             
    }
    public void setSuma(int a, int b){        
        this.n1=a;
        this.n2=b;
        this.resul=n1+n2;
        System.out.println("El resultado de la suma es: "+resul);
    }
    public void setResta(int a, int b){
        this.n1=a;
        this.n2=b;
        this.resul=n1-n2;
        System.out.println("El resultado de la resta es: "+resul);
    }
    public void setDiv(int a, int b){
        this.n1=a;
        this.n2=b;
            if(n2<=0) 
            {
            System.out.println("No se puede dividir entre 0");
            }
            else
            {
             this.resul=n1/n2;
             System.out.println("El resultado de la division es: "+resul);
            }
       
    } 
    public void  setMul(int a, int b){
        this.n1=a;
        this.n2=b;
        this.resul=n1*n2;
        System.out.println("El resultado de la multiplioacion es: "+resul);
    }    
}
