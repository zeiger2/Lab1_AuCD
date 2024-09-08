public class mien {
    public static void main(String[] args) {
        int[] A ={5,3,2,1,4,0,-4};
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