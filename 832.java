class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int j,k;
            j=(image[i].length)-1;
            k=0;
            while(k<j){
                int temp = image[i][k];
                image[i][k]=image[i][j];
                image[i][j]=temp;
                k++;
                j--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
