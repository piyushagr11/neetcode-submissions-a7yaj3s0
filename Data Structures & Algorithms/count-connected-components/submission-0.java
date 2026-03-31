class Solution {
    public int countComponents(int n, int[][] edges) {
        int result = 0;
        List<List<Integer>> ja = new ArrayList<>();
        if(n==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            ja.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            ja.get(edges[i][0]).add(edges[i][1]);
            ja.get(edges[i][1]).add(edges[i][0]);
        }

        Set<Integer> visited = new HashSet<>();
        for(int i=0;i<ja.size();i++){
            if(!visited.contains(i)){
                dfs(visited,i,ja);
                result++;
            }
        }
            
        return result;
    }

    private void dfs(Set<Integer> visited, int i, List<List<Integer>> ja) {
        visited.add(i);
        for(int it=0;it<ja.get(i).size();it++){
            if(!visited.contains(ja.get(i).get(it))){
                dfs(visited,ja.get(i).get(it),ja);
            }
        }
    }
}
