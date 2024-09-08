public class SelectionSort {
    public static void main(String[] args) {
        int[] A ={5,3,2,1,4,0,-4};
        int temp;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[j]<A[i]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
}