class sortdef {

    public void bubbleSort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }      
            }
        }
    }



public void display(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.printf("%5d",arr[i]);// aligning with 5 spaces.
    }
    System.out.println();
}
}
               
