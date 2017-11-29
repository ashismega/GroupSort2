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
        Comparable arry[] = {3, 2, 5, 6, 4, 7, 4, 6};
        bubble(arry);
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
}
