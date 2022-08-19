class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int row = image.length;
        int col = image[0].length;
        fill(image, sr, sc, row, col, color, image[sr][sc]);
        return image;
    }
    public static void fill(int[][] image, int sr, int sc, int row, int col, int newColor, int intialColor){
        if(sr<0 || sr>=row || sc<0 || sc>=col || image[sr][sc]!=intialColor || image[sr][sc]==newColor) return;
        image[sr][sc] = newColor;
        fill(image, sr+1, sc, row, col, newColor, intialColor);
        fill(image, sr-1, sc, row, col, newColor, intialColor);
        fill(image, sr, sc+1, row, col, newColor, intialColor);
        fill(image, sr, sc-1, row, col, newColor, intialColor);
    }
}