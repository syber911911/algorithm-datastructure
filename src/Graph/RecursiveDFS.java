package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class RecursiveDFS {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxVertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        int[][] adjMatrix = new int[maxVertex][maxVertex];

        while (edge-- != 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // 무향 그래프의 경우
            adjMatrix[start][end] = 1;
            adjMatrix[end][start] = 1;
        }
        for (int[] row : adjMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        boolean[] visited = new boolean[maxVertex];
        List<Integer> visitOrder = new ArrayList<>();
        recursive(0, maxVertex, adjMatrix, visited, visitOrder);
        System.out.println(visitOrder);
    }

    public void recursive(
            int next, // 다음 (이번 호출)에서 방문할 곳
            int maxVertex, // 정점 개수
            int[][] adjMatrix, // 그래프 정보
            boolean[] visited, // 방문한 정점 정보
            List<Integer> visitOrder // 구하고자 하는 목적에 따라 다름, 방문 순서 기록을 위한 리스트
    ) {
        visited[next] = true;
        visitOrder.add(next);
        for (int i = 0; i < maxVertex; i++) {
            if (adjMatrix[next][i] == 1 && !visited[i]) recursive(i, maxVertex, adjMatrix, visited, visitOrder);
        }
    }

    public static void main(String[] args) throws IOException {
        new RecursiveDFS().solution();
    }
}




/*
---> 정점의 개수, 간선의 개수
8 10
0 1
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */