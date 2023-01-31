
public class App {
    public static void main(String[] args) throws Exception {
      // Bubble Sorting 
      int a[] = {4, 8, 6, 2, 3, 1};
      int n = a.length;
      for(int i=0; i<n-1; i++){
        for(int j=0; j<n-1-i; j++){
            if(a[j+1] < a[j]){
                int temp = a[j+1];
                a[j+1] = a[j];
                a[j] = temp; 
            }
        }
      }
      for(int item:a){
        System.out.print(item + " ");
      }
}
}
