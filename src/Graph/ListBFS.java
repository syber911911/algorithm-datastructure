package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListBFS {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxVertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < maxVertex; i++) {
            adjList.add(new ArrayList<>());
        }

        while (edge-- != 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            // 무향 그래프의 경우
            adjList.get(start).add(end);
            adjList.get(end).add(start);
        }

        for (List<Integer> row : adjList) {
            Collections.sort(row);
            System.out.println(row);
        }

        Queue<Integer> toVisit = new LinkedList<>();
        // 방문 순서 기록용 List
        List<Integer> visitedOrder = new ArrayList<>();
        // 방문 기록용 boolean[]
        boolean[] visited = new boolean[maxVertex];

        int next = 0;
        toVisit.offer(next);
        // 큐가 비어있지 않은 동안 반복
        while (!toVisit.isEmpty()) {
            // 다음 방문 정점 회수
            next = toVisit.poll();

            // 이미 방문 했다면 다음 반복으로
            if (visited[next]) continue;

            // 방문했다 표시
            visited[next] = true;
            // 방문한 순서 기록
            visitedOrder.add(next);

            // 다음 방문 대상을 검색한다.
            List<Integer> canVisitList = adjList.get(next);
            for (Integer canVisit : canVisitList) {
                if (!visited[canVisit]) toVisit.offer(canVisit);
            }
        }

        // 출력
        System.out.println(visitedOrder);
    }

    public static void main(String[] args) throws IOException {
        new ListBFS().solution();
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