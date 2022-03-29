package pl.jano;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ZAD4 {

  public void recorderDigits(List<Integer> lista, String a) {
        boolean choose;
        if (a.equals("asc"))
            choose=true;
        else if(a.equals("desc"))
            choose=false;
        else{
            throw new IllegalArgumentException("zle dane");

        }

        if(lista.size()==0)
            throw new IllegalArgumentException("Pusta lista");

            for (int i = 0; i < lista.size();i++){

                int result = lista.get(i);
                String orginal = String.valueOf(result);


                result = Integer.parseInt(sortString(orginal, choose));
                lista.set(i,result);
                System.out.print(lista.get(i)+" ");
            }

    }


    public static String sortString(String Source, boolean assendingOrder) {
        char[] original = String.valueOf(Source).toCharArray();
        Arrays.sort(original);
        if (assendingOrder) {
            return new String(original);
        }
        char[] dessending = new char[original.length];
        for (int i = original.length - 1; i >= 0; i--) {
            dessending[i] = original[(original.length - 1) - i];
        }
        return new String(dessending);
    }


    void show(String a){
        List<Integer> lista = new ArrayList<>();
        Random random= new Random();
        for(int i=0;i<100;i++)
            lista.add(random.nextInt(1000));
        recorderDigits(lista,a);

    }

}
