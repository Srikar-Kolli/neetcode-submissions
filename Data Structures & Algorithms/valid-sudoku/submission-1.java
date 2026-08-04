class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <Character> numberValid = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            numberValid.clear();
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.') {
                    continue;
                }

                else if (numberValid.contains(board[row][col])) {
                    return false;
                }

                numberValid.add(board[row][col]);

            }
        }


        for (int col = 0; col < board[0].length; col++) {
            numberValid.clear();
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] == '.') {
                    continue;
                }

                else if (numberValid.contains(board[row][col])) {
                    return false;
                }

                numberValid.add(board[row][col]);

            }
        }

    
        for (int startRow = 0; startRow <= board.length - 3; startRow +=3){
            for (int startCol = 0; startCol <= board[0].length - 3; startCol += 3) {

                numberValid.clear();
             

                for (int rowCell = startRow; rowCell < startRow + 3; rowCell++) {
                    

                    for (int colCell = startCol; colCell < startCol + 3; colCell++) {
                        if (board[rowCell][colCell] == '.') {
                            continue;
                        }

                        else if (numberValid.contains(board[rowCell][colCell])) {
                            return false;
                        }

                        numberValid.add(board[rowCell][colCell]);

                    }
                }
           }
     }

     return true;
           
         



    }
}
            
