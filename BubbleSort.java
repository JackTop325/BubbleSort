class BubbleSort{
    public static int[] bubbleSort(int[]arr){
        int size = arr.length;
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static int[] bubbleSort(int[]arr,boolean ascending){
        int size = arr.length;
        if(ascending == true){
            for(int i = 0; i < size-1; i++){
                for(int j = 0; j < size-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }else if(ascending == false){
            for(int i = 0; i < size-1; i++){
                for(int j = 0; j < size-i-1; j++){
                    if(arr[j] < arr[j+1]){
                        // swap arr[j+1] and arr[j]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        return arr;
    }
    public static void main(String[]args){
        int [] listNum = {3,6,4,7,5,4,9};
        listNum = bubbleSort(listNum);
        System.out.println(listNum);
    }
}