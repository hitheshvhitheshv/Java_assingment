package Module6.com;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2,7,4,5,1,3};
        int target = 6;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}