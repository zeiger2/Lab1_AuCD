public class InsertionSort {
    public static void main(String[] args) {
        int[] A ={2,-1,5,24,-20,-25,0};
        int temp;
        for(int i=1; i<A.length; i++){
            for(int j=i; j>=1; j--){
                if(A[j]<A[j-1]){
                    temp=A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
}