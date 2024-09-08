public class RandomSort {
    void Random(int[] a) {
        while (isSorted(a) == false) {
            shuffle(a);
        }
    }

    void shuffle(int[] a) {
        for (int i = 1; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }

    void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        // Enter array to be sorted here
        int[] a ={5,3,2,1,4,0,-4};
        mien ob = new mien();

        ob.RandomSort(a);

        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
