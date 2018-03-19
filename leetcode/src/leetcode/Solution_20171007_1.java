package leetcode;

import java.util.PriorityQueue;
//407. Trapping Rain Water II
//https://leetcode.com/problems/trapping-rain-water-ii/discuss/
public class Solution_20171007_1 {
    public int trapRainWater(int[][] heightMap) {
        //һ����Ԫ����һ��Cell����ʾ
        class Cell{
            int x, y,h;
            Cell(int x, int y, int height){
                this.x = x;
                this.y = y;
                h = height;
            }
        }
         if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }

        int m = heightMap.length;
        int n = heightMap[0].length;
        //���ȶ��У�ÿ�ΰ������ȶ�������У������ǰ���˳��������ÿ����������һ��
        PriorityQueue<Cell> pq = new PriorityQueue<>((v1,v2)->v1.h - v2.h);
        boolean[][] visited = new boolean[m][n];
        //�����ܳ�ʼ��Ϊ���ʹ��ģ���Χ��һ������ô��û��ʢˮ��
        for(int i = 0; i < n; i++){
            visited[0][i] = true;
            visited[m-1][i] = true;
            pq.offer(new Cell(0, i, heightMap[0][i]));
            pq.offer(new Cell(m-1, i, heightMap[m-1][i]));
        }
        for(int i = 1; i < m-1; i++){
            visited[i][0] = true;
            visited[i][n-1] = true;
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n-1, heightMap[i][n-1]));
        }
        //�ĸ�����
        int[] xs = {0,  0, 1, -1};
        int[] ys = {1, -1, 0,  0};
        int sum = 0;
        //��ʼ�����ռ�������ˮ��ÿ��ȡ������������İ�����Ȼ������ֵ�����ǵ�ǰ��Ԫ��������ɵ���
        while (!pq.isEmpty()) {
            Cell cell = pq.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cell.x + xs[i];
                int ny = cell.y + ys[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    sum += Math.max(0, cell.h - heightMap[nx][ny]);
                    pq.offer(new Cell(nx, ny, Math.max(heightMap[nx][ny], cell.h)));
                }
            }
        }
        return sum;
    }
}