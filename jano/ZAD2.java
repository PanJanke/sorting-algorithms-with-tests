package pl.jano;


import pl.Algorithms.QuickSort;
import java.util.Random;

public class ZAD2 extends QuickSort {

    public int[] tabToSpot;

    @Override
    public void sort() {
        quickSort(this.tabToSpot,0,this.tabToSpot.length-1);
    }

    @Override
    public void showFew() {
        System.out.print("[ ");
        for(int i =0; i<5;i++)
            System.out.print(this.tabToSpot[i]+" ");

        System.out.print(" ... ");

        for(int i =this.tabToSpot.length/2; i<(this.tabToSpot.length/2)+5;i++)
            System.out.print(this.tabToSpot[i]+" ");

        System.out.print(" ... ");

        for(int i =this.tabToSpot.length-5; i<this.tabToSpot.length;i++)
            System.out.print(this.tabToSpot[i]+" ");
        System.out.print(" ]");
        System.out.print("\n");
    }

    public ZAD2(int n){
        this.tabToSpot = new int [n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            tabToSpot[i] = random.nextInt(1001);
            if(random.nextInt(1000)%2==0)
                tabToSpot[i]=tabToSpot[i] * -1;
        }
    }

    public int[]  spot(int target) {

        int[] result = new int[2];

        sort();  // n log(n)
        try {

            int a = 0;
            int b = this.tabToSpot.length - 1;

            if (target > 2 * this.tabToSpot[b] || target < 2 * this.tabToSpot[0])
                throw new Exception("Brak rozwiazania");



                while (a < b) {    //  n/2
                    if (target == this.tabToSpot[a] + this.tabToSpot[b]) {
                        result[0] = a;
                        result[1] = b;
                        return result; }

                    else if (target > this.tabToSpot[a] + this.tabToSpot[b])
                        a++;

                    else
                        b--;
                }

            throw new Exception("Brak rozwiazania");




        }
        catch(Exception e){
            System.err.println("Brak rozwiazania");
        }
        return null;
    }

    void show(int n){

        int[] result=spot(n);
        if(result != null) {
            System.out.println("Position: " + result[0] + " equals: " + tabToSpot[result[0]]);
            System.out.println("Position: " + result[1] + " equals: " + tabToSpot[result[1]]);
        }





    }


}
