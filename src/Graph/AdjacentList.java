package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AdjacentList {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
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
    }

    public static void main(String[] args) throws IOException {
        new AdjacentList().solution();
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