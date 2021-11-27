public class Ex5 {
    public static void main(String[] args) {
        int[]numbers = {1,3,5,6,2,1,0};
        System.out.println(checkArrUpAndDown(numbers,3));
    }
    public static int checkArrUpAndDown(int[] arr, int index){
        int max = arr[0];
        int min = arr[index];
        boolean isUp = false, isDown = false;
        for (int i=1; i<=index;i++){
            if(max < arr[i]){
                max = arr[i];
                isUp = true;
            }else {
                isUp = false;
                break;
            }
        }
        for (int j=index;j<arr.length-1;j++){
            if(arr[j+1]<min){
                min = arr[j+1];
                isDown = true;
            }
            else {
                isDown = false;
                break;
            }
        }
        if(isUp && isDown) {
            return arr[index];
        }
        return -1;
    }
}
