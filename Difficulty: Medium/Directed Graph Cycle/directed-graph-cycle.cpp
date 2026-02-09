class Solution {   
    public:     
    bool dfs(unordered_set<int> &visited, unordered_set<int>&pathVis, unordered_map<int, vector<int>> &adjList, int node){         
        visited.insert(node);         
        pathVis.insert(node);         
        for(auto neigh : adjList[node]){             
            if(!visited.count(neigh)){                 
                if(dfs(visited, pathVis, adjList, neigh)){                     
                    return true;                 
                }             
            }             
            else if(pathVis.count(neigh)){                 
                return true;             
            }         
        }         
        pathVis.erase(node);         
        return false;     
    }     
    bool isCyclic(int V, vector<vector<int>> &edges) {         
        unordered_map<int, vector<int>> adjList;         
        for(int i = 0; i < edges.size(); i += 1){             
            adjList[edges[i][0]].push_back(edges[i][1]);         
        }         
        unordered_set<int> visited, pathVis;         
        for(int i = 0; i < V; i += 1){             
            if(!visited.count(i)){                 
                if(dfs(visited, pathVis, adjList, i)){                    
                     return true;                 
                    }             
                }         
            }         
            return false;              
        } 
    };
