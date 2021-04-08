public class ZTAverage implements Runnable{
    private int numArr[];
    public int ave;
    public ZTAverage(int arr[]){
        this.numArr=arr;
    }
    @Override
    public void run() {
        ave=0;
        for (int i=0; i<numArr.length;i++){
            ave+=numArr[i];
        }
        ave=ave/numArr.length;
    }
}