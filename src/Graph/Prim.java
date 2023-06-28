package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prim {
    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertexCount = Integer.parseInt(st.nextToken());
        int edgeCount = Integer.parseInt(st.nextToken());

        int[][] adjMatrix = new int[vertexCount][vertexCount];
        for (int i = 0; i < edgeCount; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            adjMatrix[start][end] = weight;
            adjMatrix[end][start] = weight;
        }
        boolean[] visited = new boolean[vertexCount];
        int[] dist = new int[vertexCount];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int[] parent = new int[vertexCount];

        dist[0] = 0;
        parent[0] = -1;

        for (int i = 0; i < vertexCount; i++) {
            int minDist = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < vertexCount; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    idx = j;
                }
            }
            visited[idx] = true;

            for (int j = 0; j < vertexCount; j++) {
               if (!visited[j] && adjMatrix[idx][j] != 0 && dist[j] > adjMatrix[idx][j]) {
                   dist[j] = adjMatrix[idx][j];
                   parent[j] = idx;
               }
            }
        }
        int totalWeight = 0;
        for (int i = 0; i < vertexCount; i++) {
            totalWeight += dist[i];
        }
        System.out.println(totalWeight);
        System.out.println(Arrays.toString(parent));

        return totalWeight;
    }

    public static void main(String[] args) throws IOException {
        new Prim().solution();
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
