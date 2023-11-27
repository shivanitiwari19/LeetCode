/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         int low = 1;
//         int high = n;
//         int mid = low + (high-low)/2;
//         while(low<high){
//             if (guess(mid)==-1)
//                 high = mid-1;
//             else if (guess(mid)==1)
//                 low=mid+1;
//             else 
//                 return mid;
//         }
//         return -1;
//     }
// }

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int first = 1, last = n;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }
}