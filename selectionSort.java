public class selectionSort {
    public static void main(String[] args) throws Exception {
    int a[] = {100, 88, 5, 56, 20};
    int n = a.length;

    for(int i=0; i<n; i++){
        int minInd = i;
        for(int j=i+1; j<n; j++){
            if(a[minInd] > a[j]){
                minInd = j;
            }
        }
        int temp = a[i];
        a[i] = a[minInd];
        a[minInd] = temp;
    }
    for(int e:a){
        System.out.print(e + " ");
    }

}
}
