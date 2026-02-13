package TimeAndSpaceComplexity;

public class DuplicateElements {
    public static void main(String[] args) {

//        Approach 1
        int[] arr ={5,2,4,3,2,1};
        int n=1;
        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                   System.out.println("Duplicate element is: "+arr);
               }
           }
        }
    }
}
