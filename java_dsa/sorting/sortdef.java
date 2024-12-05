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

    public void selectSort(int []arr){
        int n= arr.length;
        int i=0,j=0,min=-1, temp=0;
        
        for(i=0;i<n-1;i++){
            min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                min=j;
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }

    public void insertsort(int []arr){
        int n=arr.length;
        int i=1,j=0,key=0;
        for(;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

public void display(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.printf("%5d",arr[i]);// aligning with 5 spaces.
    }
    System.out.println();
}
}
               
