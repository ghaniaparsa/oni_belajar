package bubble_sort;

public class Meng {
public static void main(String[] args){
    System.out.println("hi");
    int [] data = { 5, 7, -3, 6, 1};
    bubleSort(data);


}
public static void bubleSort (int [] data){
    for (int a=data.length-1; a>0 ; a--){
            for(int b = 0 ; b<a ; b++){
                if (data [b+1]> data [b]){
                   int temp = data[b];
                    data[b]= data[b+1];
                    data[b+1] =temp;
                }
            }
        }
    for(int d:data){
        System.out.print(d+" ");
    }

    }
}