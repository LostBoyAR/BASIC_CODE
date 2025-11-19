// Draw a line using Bresenham's algorithm

#include <graphics.h>
#include <stdio.h>

// Function to implement Bresenham's Line Drawing Algorithm
void bresenhamLine(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;
    int p = 2 * dy - dx; // Initial decision parameter
    int x = x1, y = y1;

    while (x <= x2) {
        putpixel(x, y, WHITE); // Plot the pixel
        x++;

        if (p < 0) {
            p += 2 * dy;
        } else {
            y++;
            p += 2 * (dy - dx);
        }
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    int x1, y1, x2, y2;
    printf("Enter the starting point (x1, y1): ");
    scanf("%d %d", &x1, &y1);
    printf("Enter the ending point (x2, y2): ");
    scanf("%d %d", &x2, &y2);

    bresenhamLine(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}