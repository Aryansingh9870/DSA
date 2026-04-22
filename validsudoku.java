import java.util.HashSet;

public class validsudoku {

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','2','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}
        };
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                char num = board[i][j];

                if(num=='.')continue;

                if(set.contains(num)){
                    System.out.println("Invalid");
                    return;
                }
                set.add(num);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                char num = board[j][i];

                if(num=='.') continue;

                if(set.contains(num)){
                    System.out.println("Invalid");
                    return;
                }
                set.add(num);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
            HashSet<Character> set = new HashSet<>();

            for(int k=0;k<3;k++){
                for(int l=0;l<3;l++){
                char num = board[i+k][j+l];

                if(num=='.') continue;

                if(set.contains(num)){
                    System.out.println("Invalid");
                    return;
                }
                set.add(num);
            }
           }
          }
        }

      System.out.println("Valid");
    }
}