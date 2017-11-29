/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 073903999
 */
public class SearchSortHelper {
    int[] a = {1,2,3,4,5,6,7,8,9};
    static String[] b = {"airplane","boom","cow","dog","elephant","flower","great","hello","iodine","jock"};
   
    public static void main(String[] args) {
        System.out.println(binary(b,"elephant"));
    }
    
    public boolean sequential(int attempt){
        double q = System.currentTimeMillis();
        for(int val: a){
            if(val == attempt){
                double e = System.currentTimeMillis();
                System.out.println(e-q);
                return true;
            }
        }
        return false;  
    }
    
    public boolean sequential(String attempt){
        double q = System.currentTimeMillis();
        for(String val:b){
            if(val.equals(attempt)){
                double e = System.currentTimeMillis();
                System.out.println(e-q);
                return true;
            }
        }
        return false;
    }
    
    public int binary(int[] array, int target){
        int low = 0;
        int high = array.length;
        int mid = 0;
        while (low <= high){
            mid = (low + high) / 2;
            
            if (array[mid] == target){
                return mid;
            }
            
            else if (array[mid] > target){
                high = mid-1;
            }
            
            else{
                low = mid + 1;
            }
        }
            
        return -1;  
    }
    public static String binary(String[] array, String target){
        int low = 0;
        int high = array.length;
        int mid = 0;
        while (low <= high){
            mid = (low + high) / 2;
            
            if (array[mid].equals(target) ){
                return array[mid];
            }
            
            else if (array[mid].compareTo(target) >0 ){
                high = mid-1;
            }
            
            else{
                low = mid + 1;
            }
        }
            
        return "not found";  
    }
    
}
