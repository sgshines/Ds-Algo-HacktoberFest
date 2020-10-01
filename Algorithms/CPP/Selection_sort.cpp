
// Function for swaping two numbers
void swap (int *xp  , int *yp){
     int temp = *xp;
     *xp = *yp;
     *yp = temp
}
void selectionSort(int arr[] , int n){
     int i,j,min_index;
     
     for(int i=0;i<n-1;i++){
     // Find the minimum element in the unsorted array
       min_index = i;
       for(int j=i+1 ; j<n;j++){
        if(arr[j] < arr[min_index]){
                  min_index = j;
                  }
              // Swaping the minimum element with the ith element
        swap (& arr[min_index] , & arr[i]);
       }
     
     }

}
