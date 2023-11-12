// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         for(int i=0 ; i<image.length ; i++){
//             for(int j=0 ; j<image[i].length ; j++){
//                 int temp=0;
//                 int s = 0;
//                 int e = image[i].length - 1;
//                 while(s<e){
//                     temp = image[i][s];
//                     image[i][s] = image[i][e];
//                     image[i][e] = temp;
//                     s++;
//                     e--;
//                 }
//             }
//         }
        
//         for(int i=0 ; i<image.length ; i++){
//             for(int j=0 ; j<image[i].length ; j++){
//                 if(image[i][j] == 0)
//                     image[i][j] = 1;
//                 else
//                     image[i][j] = 0;
//             }
//         }
//         return image;
//     }
// }


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr[][] = new int[image.length][image.length];
        int n;
        for(int i = 0; i < image.length; i++) {
            n = image.length - 1;
            for(int j = 0; j < image.length; j++) {
                arr[i][j] = image[i][n];
                n--;
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}