/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 073903999
 */
public class Main {
    public void bubble(Comparable [] a){
        boolean swapped;
        Comparable temp;
        do{
            swapped=false;
            for(int i = 0; i<=a.length-1;i++){
                if(a[i].compareTo(a[i+1])>0){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    swapped=true;
                }
            }
        }while(swapped);
        }
    }
    public void insertion(){
        
    }
}

