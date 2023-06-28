package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Kruskal {
    int[] parent;

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertexCount = Integer.parseInt(st.nextToken());
        int edgeCount = Integer.parseInt(st.nextToken());

        parent = new int[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            parent[i] = i;
        }

        int[][] edges = new int[edgeCount][3];
        for (int i = 0; i < edgeCount; i++) {
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            edges[i][2] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(edges, Comparator.comparingInt(edge -> edge[2]));

        int picked = 0;
        int totalWeight = 0;
        List<String> pickedEdges = new ArrayList<>();
        for (int i = 0; i < edgeCount; i++) {
            int start = edges[i][0];
            int end = edges[i][1];

            if (findSet(start) != findSet(end)) {
                union(start, end);
                picked++;
                totalWeight += edges[i][2];
                pickedEdges.add(Arrays.toString(edges[i]));
            }

            if (picked == vertexCount - 1) break;
        }
        System.out.println(totalWeight);
        System.out.println(pickedEdges);
    }

    public int findSet(int vertex) {
        if (parent[vertex] != vertex) return findSet(parent[vertex]);
        else return parent[vertex];
    }

    // y가 속한 집합을 x가 속한 집합에 합친다
    public void union(int x, int y) {
        parent[findSet(y)] = findSet(x);
    }

    public static void main(String[] args) throws IOException {
        new Kruskal().solution();
    }
}

/*
8 11
0 1 41
0 2 14
0 3 13
1 4 27
2 5 21
3 5 33
3 7 22
4 6 11
4 7 17
5 6 35
6 7 19
 */