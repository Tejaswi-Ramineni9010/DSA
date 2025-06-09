import java.util.ArrayList;
public class Unionof2SortedWithDuplicates {
    public static ArrayList<Integer> findUnion(int[] a,int[] b){
        ArrayList<Integer> array=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length &&j<b.length){
            if(i>0&&a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0&&b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                array.add(a[i]);
                i++;

            }
            else if(a[i]>b[j]){
                array.add(b[j]);
                j++;

            }
            else{
                array.add(a[i]);
                i++;
                j++;


            }
        }
        while(i<a.length){
            if(i==0||a[i]!=a[i-1]){
                array.add(a[i]);
                
            }
            i++;
        }
        while(j<b.length){
            if(j==0||b[j]!=b[j-1]){
                array.add(b[j]);
                
            }
            j++;
        }
    return array;
    }
     public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 3, 5, 6};

        ArrayList<Integer> result = findUnion(a, b);

        System.out.println("Union of the two arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    
}
