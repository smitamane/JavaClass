public class Balancearray {
// To check if total of both strings Left hand side and right hand side is equal
    public static void main(String[] args) {
        int[] onearray = {5, 3, 1, 5, 6, 1, 1, 1};
        boolean isBalnced =false;
        for (int i = 0; i < onearray.length; i++) {

            int lhs=0;
            int rhs=0;
            for (int j = 0; j <= i; j++) {
                     lhs+=onearray[j];
                }
            for(int k=i+1;k<onearray.length;k++){

                 rhs+=onearray[k];

            }
            if(lhs==rhs)
            {
                System.out.println("Balanced "+i);
                isBalnced = true;
                break;
            }

           }
        if(!isBalnced){
            System.out.println("Not Balanced");

        }
        }
    }

