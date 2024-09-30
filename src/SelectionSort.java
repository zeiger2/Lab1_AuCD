public class SelectionSort {
    static int find_min(int[] a, int k) {
        int temp2=a[k];
        int index_min=k;
        for (int i=k; i<a.length; i++){
            if (a[i]<temp2){
                temp2=a[i];
                index_min=i;
            }
        }
        return index_min;
    }

    static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] A ={5,3,2,1,4,0,-4};
        int temp, index_min;
        for(int i=0; i<A.length; i++){
            index_min=find_min(A,i);
            System.out.println(A[index_min]);
            if (A[index_min]!=A[i]){
                swap(A, index_min, i);
            }

        }
        System.out.println("Sorted Array:");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
}