

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
    
    public static void main(String[] args) {
        Comparable arry[] = {3, 2, 5, 6,4,3,6,5,7,9,7,6,32,2,3,4,1,31,3,434,1, 4, 7, 4, 6};
        
        
        insertion(0, arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        
    }

    public static void bubble(Comparable[] a) {
        boolean swapped;
        Comparable temp;
        do {
            swapped = false;

            for (int i = 0; i < a.length; i++) {
                try {
                    if (a[i].compareTo(a[i + 1]) > 0) {
                        temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        swapped = true;
                    }
                } catch (ArrayIndexOutOfBoundsException ex) {
                }
            }
        } while (swapped);

    } 
    public void selection(Comparable[] array){
        Comparable lowest = 0;
        for (int i = 0; i<array.length;i++){
             
        }
    }
    public int indexOfSmallest (Comparable[] array, int low, int high){
        int lowestIndex = low;
        for (int j = 0; j<array.length;j++){
            if (array[j].compareTo(array[lowestIndex])<0){
                lowestIndex = j;
                break;
            }
        }
        return lowestIndex;
    }
    
    // ashers
    public static void insertion(int val, Comparable[] array){
        int nexPos = array.length-2;
        Comparable[] newArray = new Comparable[array.length+1];
        
        for(int i = 0; i>=array.length;i++){
            newArray[i] = array[i];
        }
        
        for(int i = nexPos; i==0;i--){
            
            if(nexPos>val){
                newArray[i+1] =  newArray[i];
            }
            
            else if(nexPos<=val){
                newArray[i] = val;
                break;
            }
        }
        
        array = newArray;
    } 
}
