class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i< image.length; i++)
        {
             swap(image,i);
        }
        for(int i=0; i<image.length; i++){
          for(int j=0;j<image[i].length;j++){
              if(image[i][j] == 1){
                  image[i][j] = 0;
              }
              else{
                  image[i][j] = 1;
              }
          }
        }
        return image;
    }
    void swap(int[][] image , int i){
      int k=0;
        int j = image[i].length -1;
        while(k<j){
            int temp = image[i][k];
            image[i][k] = image[i][j];
            image[i][j] = temp;
            k++;
            j--;
            
        }
    }
}