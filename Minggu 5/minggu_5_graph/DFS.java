/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_5_graph;
//import iterator dan linkedList
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class DFS {
    int V;

    //menyimpan node
    LinkedList<Integer> adjList[];
    DFS(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList();  //daftar kosong untuk setiap node
        }
    }
    //penambahan edge pada Grph
    void addEdgesToGraph(int v, int u) {
        adjList[v].add(u);     //untuk menambahkan vertex ke adjacency lain agar edge dapat ditambahkan pada graph.
    }
    //code yang digunakan untuk melacak node yang akan dikunjungi
    void DFTraversal(int v, int visited[]) {
        visited[v] = 1;
        System.out.print(v + " ");
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (visited[n] == 0) {
                DFTraversal(n, visited);
            }
        }
    }
    void DFSearch(int v) {
        int visited[] = new int[V];    
    DFTraversal(v, visited);
        for (int i = 1; i < V; i++) {
            if (visited[i] == 0) {
                DFTraversal(i, visited);
            }
        }
    }

    public static void main(String args[]) {
        DFS obj = new DFS(10); //
 

        obj.addEdgesToGraph(1, 3);
        obj.addEdgesToGraph(1, 4);
        obj.addEdgesToGraph(3, 5);
        obj.addEdgesToGraph(3, 6);
        obj.addEdgesToGraph(4, 7);
        obj.addEdgesToGraph(4, 8);
        obj.addEdgesToGraph(2, 9);
        obj.addEdgesToGraph(2, 1);
        obj.addEdgesToGraph(1, 2);

        obj.DFSearch(1);
    }
}

