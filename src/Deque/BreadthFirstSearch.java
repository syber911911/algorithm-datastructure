package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNodes = Integer.parseInt(br.readLine());
        int[][] adjMap = new int[maxNodes + 1][maxNodes + 1];

        String[] edges = br.readLine().split(" ");
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);
            adjMap[leftNode][rightNode] = 1;
            adjMap[rightNode][leftNode] = 1;
        }

        Queue<Integer> toVisit = new LinkedList<>();
        List<Integer> visitedOrder = new LinkedList<>();

        boolean[] visited = new boolean[maxNodes + 1];

        int next = 1;
        toVisit.offer(next);
        while (!toVisit.isEmpty()) {
            next = toVisit.poll();
            if (visited[next]) continue;

            visited[next] = true;
            visitedOrder.add(next);

            for (int i = 0; i < maxNodes + 1; i++) {
                if (adjMap[next][i] == 1 && !visited[i]) {
                    toVisit.offer(i);
                }
            }
        }
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new BreadthFirstSearch().solution();
    }
}
