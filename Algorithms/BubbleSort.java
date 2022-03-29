package pl.Algorithms;



public class BubbleSort extends Sort{



    public BubbleSort(){
        this.tab=new int[50000];
    }





    @Override
    public void sort() {
        bubbleSort(this.tab);
    }

    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


}
