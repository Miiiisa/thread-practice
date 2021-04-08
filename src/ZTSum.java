public class ZTSum implements Runnable{
    private int numArr[];
    public int sum;
    public ZTSum(int arr[]){
        this.numArr=arr;
    }
    @Override
    public void run() {
        sum=0;
        for (int i=0; i<numArr.length;i++){
            sum+=numArr[i];
        }



    }
}
