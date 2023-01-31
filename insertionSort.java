public class insertionSort {
    public static void main(String[] args) throws Exception {
    int a[] = {5, 1, 8, 3, 5, 7, 6, 0};
    int n = a.length;

    for(int i=1; i<n; i++){
        int current = a[i];
        int j = i-1;

        while(j >= 0 && current < a[j]){
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = current;
    }
        for(int e:a){
            System.out.print(e + " ");
    }
    }
}
