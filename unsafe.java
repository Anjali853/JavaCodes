import java.util.*;

public class unsafe {
    public static boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Deque<int[]> deque = new ArrayDeque<>();

        dist[0][0] = grid.get(0).get(0);
        deque.offerFirst(new int[] { 0, 0 });

        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        while (!deque.isEmpty()) {
            int[] cur = deque.pollFirst();
            int r = cur[0];
            int c = cur[1];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                    continue;

                int newCost = dist[r][c] + grid.get(nr).get(nc);

                if (newCost < dist[nr][nc]) {
                    dist[nr][nc] = newCost;

                    if (grid.get(nr).get(nc) == 0)
                        deque.offerFirst(new int[] { nr, nc });
                    else
                        deque.offerLast(new int[] { nr, nc });
                }
            }
        }

        return dist[m - 1][n - 1] < health;
    }

    public static void main(String[] args) {

        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 1, 0, 0, 0));
        grid.add(Arrays.asList(0, 1, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 1, 0));

        int health = 1;

        System.out.println(findSafeWalk(grid, health));
    }
}
