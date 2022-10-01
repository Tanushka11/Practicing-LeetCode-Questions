class Solution {
    public int countOdds(int low, int high) {
        int total = (high - low) + 1;
        
//         case 1 - both  low and high are odd
//         [odd, even , odd]
        if(low % 2 != 0 && high % 2 != 0){
            return total/2 + 1;
        }
        
//         case 2 - low is even, high is odd 
//         [even odd even odd]
//         case 3 - high is odd , high is even
//         [odd even odd even]
//         case 4 - both low and high are even
//         [even odd even odd even]
        return total/2;
    }
}