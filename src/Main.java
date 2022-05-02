import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 рівень");
        int [] arr = new int[1000000];
        for(int i= 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        int[] arrMerge = arr;
        long startMerge = System.nanoTime();
        MergeTD.sort(arrMerge);
        long endMerg = System.nanoTime();
        System.out.println();
        System.out.println();
        System.out.println();
        double timeMerge = (double)(endMerg-startMerge)/1000000000;
        System.out.println("Час сортування масиву на 1000000 елементів методом низхідного злиття: "+timeMerge +" секунд");


        System.out.println("2 рівень");
        int[] arrBubble = arr;
        long startBubble = System.nanoTime();
        bubbleSort(arrBubble);
        long endBubble=System.nanoTime();
        double timeBubble=(double)(endBubble-startBubble)/1000000000;
        System.out.println();
        System.out.println("Час сортування масиву на 1000000 елементів бульбашковим методом: "+timeBubble+" секунд");

        int[] arrBubbleDown = arr;
        long startBubbleDown = System.nanoTime();
        bubbleSortDown(arrBubbleDown);
        long endBubbleDown=System.nanoTime();
        double timeBubbleDown=(double)(endBubbleDown-startBubbleDown)/1000000000;
        System.out.println();
        System.out.println("Час сортування масиву на 1000000 елементів бульбашковим методом (за спаданням): "+timeBubbleDown+" секунд");
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void bubbleSortDown(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}