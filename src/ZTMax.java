public class ZTMax implements Runnable{
    private int numArr[];
    public int max;
    public ZTMax(int arr[]){
        this.numArr=arr;
    }
    @Override
    public void run() {
        max=numArr[0];
        for (int i=0; i<numArr.length;i++){
            if (numArr[i]>=max) max=numArr[i];
        }
    }
}