package pl.Algorithms;

import java.util.Random;

public abstract class Sort implements SortFunctions {
    public int[] tab;

    public void showTime(){
        optimisticFill();
        long tStart = System.currentTimeMillis();
        sort();
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optimistic Time: " + elapsedSeconds);

        randomFill();
        tStart = System.currentTimeMillis();
        sort();
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Expected Time: " + elapsedSeconds);



        pesimisticFill();
        tStart = System.currentTimeMillis();
        sort();
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesimistic Time: " + elapsedSeconds);

    }

    public void showFew() {
        System.out.print("[ ");
        for(int i =0; i<5;i++)
            System.out.print(this.tab[i]+" ");

        System.out.print(" ... ");

        for(int i =this.tab.length/2; i<(this.tab.length/2)+5;i++)
            System.out.print(this.tab[i]+" ");

        System.out.print(" ... ");

        for(int i =this.tab.length-5; i<this.tab.length;i++)
            System.out.print(this.tab[i]+" ");
        System.out.print(" ]");
        System.out.print("\n");

    }

    public void randomFill(){
        Random random= new Random();
        for(int i=0;i<this.tab.length;i++)
            this.tab[i]=random.nextInt(50000);
    }

    public void optimisticFill(){
        for(int i=0;i<this.tab.length;i++)
            this.tab[i]=i;
    }

    public void pesimisticFill(){
        for(int i=0;i<this.tab.length;i++)
            this.tab[i]=this.tab.length-i;
    }

    public abstract void sort();

}
