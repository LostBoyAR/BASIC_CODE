#include <iostream>
#include <graphics.h>
#include <cmath>

using namespace std;

// Function to draw a line using DDA algorithm
void drawLineDDA(int x1, int y1, int x2, int y2) {
    // Calculate the differences
    int dx = x2 - x1;
    int dy = y2 - y1;

    // Calculate the number of steps
    int steps = max(abs(dx), abs(dy));

    // Calculate the increment values for each step
    float xIncrement = dx / (float)steps;
    float yIncrement = dy / (float)steps;

    // Initialize starting point
    float x = x1;
    float y = y1;

    // Draw the line
    for (int i = 0; i <= steps; i++) {
        putpixel(round(x), round(y), WHITE); // Draw pixel at (x, y)
        x += xIncrement; // Increment x
        y += yIncrement; // Increment y
    }
}

int main() {
    // Initialize graphics mode
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    // Coordinates of the line
    int x1 = 100, y1 = 100, x2 = 200, y2 = 200;

    // Draw the line using DDA algorithm
    drawLineDDA(x1, y1, x2, y2);

    // Wait for user input to close the graphics window
    getch();
    closegraph();

    return 0;
}


