package sales;

public class SalesItem {
   
    public static void main(String[] args) {
        String shirts[][]= new String[2][2];
        shirts [0][0] = "red";
        shirts [0][1] = "blue";
        shirts [1][0] = "small";
        shirts [1][1] = "medium";


        for (int i = 0; i < 2 ;){
            for (int j = 0; j < 2;){
                System.out.print(shirts[i][j]+":");
                j++;
            }
            i++;
        }
        
        int x=5;
        while (isAvailable(x)){
            System.out.println(x);
                      
        }
    }
    public static boolean isAvailable(int x){
        return x-- >0 ?true:false;
    }
}
