class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int centerColor = image[sr][sc];
        if (centerColor != color)
        fillNext(image, sr,sc,centerColor,color);
        return image;
    }

    public void fillNext(int[][] image, int r,int c, int centerColor, int color) {
        if (image[r][c] == centerColor)
        {image[r][c] = color;
        if (r >= 1)
        fillNext(image, r - 1 ,c , centerColor, color);
        if(c >= 1)
        fillNext(image, r ,c - 1 , centerColor, color);
        if (r + 1 < image.length)
        fillNext(image, r + 1 ,c , centerColor, color);
        if (c + 1 < image[0].length)
        fillNext(image, r ,c + 1 , centerColor, color);}
    }
}
