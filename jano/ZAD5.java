package pl.jano;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZAD5 {
   // public ZAD5(){}

    public String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }



    public int kaprekar(int a){
       // try{

            int test = a;

            ArrayList<Integer> array = new ArrayList<Integer>();
            do{
                array.add(test% 10);
                test /= 10;
            } while  (test > 0);


            if(array.size()>4 || a==0)
                throw new IllegalArgumentException("zle dane");



            String orginal = String.valueOf(a);
            while(orginal.length()!=4)
                orginal=addChar(orginal,'0',orginal.length()-1);

            if(array.get(0) == array.get(1) && array.get(0) == array.get(2) && array.get(0) ==  array.get(3) )
                throw new IllegalArgumentException("zle dane");

            int count = 0;

            while (true) {
                int Max = Integer.parseInt(sortString(orginal, false));
                int Min = Integer.parseInt(sortString(orginal, true));
                count++;
                int diff = Max - Min;
                if (diff == 6174) {
                    break;
                }
                orginal = String.valueOf(diff);
                while(orginal.length()!=4)
                    orginal=addChar(orginal,'0',0);


            }

            return count;

        //catch(IllegalArgumentException e){
        //    System.err.println("Zle dane");

       // }
       // return 0;
    }

    public void show(int a){
        System.out.println("Ilosc iteracji: "+ kaprekar(a));


    }


    public  String sortString(String Source, boolean assendingOrder) {
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


}
