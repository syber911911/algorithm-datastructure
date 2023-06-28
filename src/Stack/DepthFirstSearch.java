package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DepthFirstSearch {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 입력은 정점의 개수
        int maxNodes = Integer.parseInt(br.readLine());
        // 정점 간 연결 정보
        int[][] edgeMap = new int[maxNodes + 1][maxNodes + 1];

        // 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7
        String[] edges = br.readLine().split(" ");
        // 두개씩 순회
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);
            edgeMap[leftNode][rightNode] = 1;
            edgeMap[rightNode][leftNode] = 1;
        }
        // 다음에 방문 노드를 저장하는 Stack
        Stack<Integer> toVisit = new Stack<>();
        // 방문을 기록
        boolean[] visited = new boolean[maxNodes + 1];

        // 첫 방문 대상 선정
        int next = 1;
        // 방문 대상을 Stack push
        toVisit.push(next);
        // Stack isEmpty ==> 모든 노드의 방문이 이루어졌다.
        while (!toVisit.isEmpty()) {
            // 다음 방문할 곳을 가져온다.
            next = toVisit.pop();
            // 이미 방문했다면 다음 곳으로 간다.
            if (visited[next]) continue;
            // 방문했다고 표시.
            visited[next] = true;
            // 다음 방문 대상을 검색해서, Stack push
            for (int node : edgeMap[next]) {

            }
        }
    }

    public static void main(String[] args) throws IOException {
        new DepthFirstSearch().solution();
    }
}
