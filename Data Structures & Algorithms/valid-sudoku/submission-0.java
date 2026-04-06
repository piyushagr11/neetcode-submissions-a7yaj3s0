class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> boxMap = new HashMap<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                rowMap.putIfAbsent(i, new HashSet<>());
                colMap.putIfAbsent(j, new HashSet<>());
                boxMap.putIfAbsent(((i/3)*3)+(j/3), new HashSet<>());
                if(!rowMap.get(i).add(board[i][j]) || !boxMap.get(((i/3)*3)+(j/3)).add(board[i][j]) || !colMap.get(j).add(board[i][j])){
                    return false;
                }
            }
        }
        return true;

    }
}