class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=adj.size();
        boolean[] vis=new boolean[n];
      dfs(a,vis,0,adj);
      return a;
    }
    public void dfs(ArrayList<Integer> a,boolean[] vis,int v, ArrayList<ArrayList<Integer>> adj){
        vis[v]=true;
        a.add(v);
        for(int ne:adj.get(v)){
            if(!vis[ne]){
                dfs(a,vis,ne,adj);
            }
        }
    }
}