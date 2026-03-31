class Solution {
     public boolean validTree(int n, int[][] edges) {
        if(n-1 == edges.length){
            if(n==1){
                return true;
            }
            Map<Integer, List<Integer>> gr = new HashMap<>();
            for(int i=0;i<edges.length;i++){
                gr.putIfAbsent(edges[i][0], new ArrayList<>());
                gr.putIfAbsent(edges[i][1], new ArrayList<>());
                gr.get(edges[i][0]).add(edges[i][1]);
                gr.get(edges[i][1]).add(edges[i][0]);
            }
            Set<Integer> visited = new HashSet<>();
            
            dfs(visited,gr,edges[0][0]);
            if(visited.size() == n){
                return true;
            }
            return false;
        }
        return false;
    }

    private void dfs(Set<Integer> visited, Map<Integer, List<Integer>> gr, int ite) {
        visited.add(ite);
        if(gr.containsKey(ite)){
            List<Integer> edges = gr.get(ite);
            for(int i=0;i<edges.size();i++){
                if(!visited.contains(edges.get(i))){
                    dfs(visited,gr,edges.get(i));
                }
            }
        }
        
    }
}
