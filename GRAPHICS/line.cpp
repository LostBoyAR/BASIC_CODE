#include <graphics.h>
#include <iostream>
using namespace std;

// Function to implement Bresenham's Line Drawing Algorithm
void bresenhamLine(int x1, int y1, int x2, int y2) {
    int dx = x2 - x1;
    int dy = y2 - y1;

    int x = x1, y = y1;

    int p = 2 * dy - dx; // Initial decision parameter

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
    int gm, gd, x1 = 100, y1 = 100, x2 = 300, y2 = 300;
    gm = gd = DETECT;
    initgraph(&gm, &gd, "");

    bresenhamLine(x1, y1, x2, y2);

    getch();
    closegraph();
    return 0;
}