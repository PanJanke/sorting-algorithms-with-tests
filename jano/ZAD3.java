package pl.jano;

import pl.Algorithms.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZAD3 extends QuickSort {



public List <Integer> missingNum(List<Integer> a, int max){
    boolean[] tab = new boolean[max];

    for(int i=0;i<max;i++)
        tab[i]=false;

    int counter=0;
    for(int i=0;i<a.size();i++){
        if(a.get(i)>=max)
            continue;
        if(tab[a.get(i)]==false) {
            tab[a.get(i)] = true;
            counter++;

        }
    }
    List<Integer> lista = new ArrayList<Integer>();

    for(int i=0;i<max;i++)
        if(tab[i]==false) {
         lista.add(i);
        }

    lista.remove(0);
        return lista;
}


void show(int n,int border,int borderToFind){

    List<Integer> lista = new ArrayList<Integer>();
    Random random = new Random();
    for(int i=0;i<n;i++)
        lista.add(random.nextInt(border));

    for(int i=0;i<lista.size();i++)
        System.out.print(lista.get(i)+" ");
        System.out.print("\n");

    List<Integer> result = missingNum(lista,borderToFind);
    System.out.println("Brakujace liczby: ");

    for (int i=0;i< result.size();i++)
        System.out.print(result.get(i)+ " ");

        System.out.print("\n");

}


}
