//RESUELTO POR GABRIEL PAUL HURTADO MATAMOROS
import java.util.*;
public class Principal 
{
    public static void main(String[] args)
    {
        System.out.print("Ingrese un numero entero:  ");
        Scanner leer=new Scanner(System.in);
        int num=Integer.parseInt(leer.nextLine());
        Operaciones oper=new Operaciones();
        oper.m=num;
        oper.canDigitos();
        oper.sumaDigitos();
        oper.productoDigitos();
        oper.digitoDerecho();
        oper.digitoIzquierdo();
        oper.digitoMayor();
        oper.digitoMenor();
        oper.numeroInvertido();

       
    }
}

//RESUELTO POR GABRIEL PAUL HURTADO MATAMOROS
class Operaciones {
   static int m;
    void canDigitos()
         { 
             int n=m;
               int cont=0;
              while(n!=0)
                     {
                         if(n!=10)
                         {
                         n=(n-n%10)/10;
                         cont++;
                         }     
                     }
              System.out.println("El número ingresado tiene : "+cont+"   cifras \n");
   
            }
   
    void sumaDigitos()
         {
             int n=m;
        int sum=0;
        while(n!=0)
              {
                  if(n!=0)
                      {
                          sum=sum+n%10;
                          n=(n-n%10)/10;
                      }
              }
        System.out.println("La suma de cifras del numero ingresado es:  "+sum+"\n");
    }
    void productoDigitos()
    {
        int n=m;
        int prod;
        System.out.println("CALCULANDO EL PRODUCTO DE DIGITOS");
        if(n!=0)
        {
            prod=1;
            while(n!=0)
           {
                 prod=prod*(n%10);
                 n=(n-n%10)/10;
                 
           }   
            System.out.println("El producto de digitos del numero ingresado es: "+prod+"\n");
        }
        else
        {
            System.out.println("El nuemro ingresado solo tiene un digito y  es: "+n+"\n");
        }
       
    }
     void digitoIzquierdo()
    {
        int n=m;
        System.out.println("CALCULANDO EL DIGITO IZQUIERDO");
        int di;
        if(n>=10 ||  n<=-10)
        {         
            while(n>=10 || n<=-10)
            {
                  n=(n-n%10)/10;
            }
           
            System.out.println("El digito izquierdo del numero ingresado es:  "+n+"\n");
        }
        else
        {
            System.out.println("El numero ingresado tiene un solo digito y es: "+n+"\n");
        }
    }
     void digitoDerecho()
    {
        int n=m;
        int dd;
        System.out.println("CALCULANDO EL DIGITO DERECHO");
        if(n>=10 ||  n<=-10)
        {
            dd=n%10;
            System.out.println("El digito derecho es: "+dd+"\n");
        }
        else
        {
            System.out.println("Elnumero ingresado solo tiene un digito y es: "+n+"\n");
        }
       
       
    }
     void digitoMenor()
    {
        int n=m;
        int dm=10;
        System.out.println("CALCULANDO EL DIGITO MENOR");
         if(n>=10 ||  n<=-10)
        {
            while(n!=0)
            {
                if(dm>n%10)
                {
                    dm=n%10;
                }
                n=(n-n%10)/10;
               
            }
            System.out.println("El digito menor es: "+dm+"\n");
        }
        else
        {
            System.out.println("Elnumero ingresado solo tiene un digito y es: "+n+"\n");
        }
    }
     void digitoMayor()
    {
        int n=m;
        int dma=-10;
        System.out.println("CALCULANDO EL DIGITO MAYOR");
         if(n>=10 ||  n<=-10)
        {
            while(n!=0)
            {
                if(dma<n%10)
                {
                    dma=n%10;
                }
                n=(n-n%10)/10;
               
            }
            System.out.println("El digito mayor es: "+dma+"\n");
        }
        else
        {
            System.out.println("Elnumero ingresado solo tiene un digito y es: "+n+"\n");
        }
    }
     void numeroInvertido()
    {
        int n=m;
        int nin;
        System.out.println("CALCULANDO EL NUMERO INVERTIDO");
         if(n>=10 ||  n<=-10)
        {
            nin=n%10;
            while(n!=0)
            {               
                n=(n-n%10)/10;
                if(n!=0)
                nin=(nin*10)+(n%10);
            }
            System.out.println("El numero invertido  es: "+nin+"\n");
            System.out.println("RESUESTO POR GABRIEL PAUL HURTADO MATAMOROS");
        }
        else
        {
            System.out.println("Elnumero ingresado solo tiene un digito y es: "+n+"\n");
        }
    }
}