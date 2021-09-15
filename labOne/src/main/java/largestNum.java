
public class largestNum {
    int getLargest(int[] nmList ){
        int max= nmList [0];
        int indx = 0;
        while( indx< nmList.length ) {
            if (nmList [indx] > max){
                    max= nmList [indx];
              }
            indx++;
        }
        return max;
    }
    public static void main(String[] args) {
        largestNum nc = new largestNum();
        int[] arr = { 3, 6, -1, 10, 15,-8};
        int mx = nc.getLargest(arr);
        System.out.println("Th max is "+ mx);
    }
}