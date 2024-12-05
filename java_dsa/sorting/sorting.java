public class sorting{
    public static void main(String args[]){

        int arr[]=new int[10];
        // getting random values in array .
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*10);
        }

        //obj created.
        sortdef sort=new sortdef();

        // printing original array
        sort.display(arr);

        sort.bubbleSort(arr);
        sort.display(arr);


            }
}