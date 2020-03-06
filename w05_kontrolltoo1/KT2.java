public class KT2 {

    public static void main(String[] args) {
        
    double[] doubleArray = new double[] { 5.0 , 4.0, 3.0}; 
    int n = doubleArray.length;
    System.out.println(average(doubleArray, n));
    //Sisend antakse massiivis ning tagastatakse keskmine.
    }

static double average(double a[], double n) { 
        int kokku = 0;
        for (int i = 0; i < n; i++) {
            kokku+=a[i];
        }
        return (kokku/n);
    }
    //Funktsioon average rvutab massiivi keskmise kiiruse, sisendiks massiiv ja massiivi pikkus.
}