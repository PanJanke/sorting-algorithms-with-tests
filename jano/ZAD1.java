package pl.jano;


import pl.Algorithms.*;

public class ZAD1 {
    void show(){

        System.out.println("\nQuickSort: ");
        QuickSort a = new QuickSort();
        a.showTime();

        System.out.println("\nBubbleSort:");
        BubbleSort b = new BubbleSort();
        b.showTime();

        System.out.println("\nHeapSort:");
        HeapSort c = new HeapSort();
        c.showTime();

        System.out.println("\nCocktailSort:");
        CocktailSort d = new CocktailSort();
        d.showTime();

        System.out.println("\nInsertionSort:");
        InsertionSort e = new InsertionSort();
        e.showTime();


    }


}
