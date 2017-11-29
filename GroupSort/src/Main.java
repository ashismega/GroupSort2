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
    public void bubble(){
        //hahahahahah bubble
    }
    public void insertion(){
        
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
}
