// Write a program to draw Indian Flag.

#include <graphics.h>
#include <iostream>
using namespace std;

void drawIndianFlag() {
    // Draw the saffron rectangle
    setcolor(WHITE);
    rectangle(200, 100, 400, 150);
    setfillstyle(SOLID_FILL, COLOR(255, 153, 51)); // Saffron color
    floodfill(201, 101, WHITE);

    // Draw the white rectangle
    rectangle(200, 150, 400, 200);
    setfillstyle(SOLID_FILL, WHITE);
    floodfill(201, 151, WHITE);

    // Draw the green rectangle
    rectangle(200, 200, 400, 250);
    setfillstyle(SOLID_FILL, COLOR(19, 136, 8)); // Green color
    floodfill(201, 201, WHITE);

    // Draw the Ashoka Chakra
    setcolor(BLUE);
    circle(300, 175, 20); // Outer circle of Ashoka Chakra
    floodfill(300, 175, BLUE);

    // Draw 24 spokes in the Ashoka Chakra using pieslice()
    int startAngle = 0, endAngle = 15;
    for (int i = 0; i < 24; i++) {
        pieslice(300, 175, startAngle, endAngle, 20); // Draw a sector for each spoke
        startAngle = endAngle; // Update startAngle to the previous endAngle
        endAngle += 15;        // Increment endAngle by 15 degrees
    }
}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "");

    drawIndianFlag();

    getch();
    closegraph();
    return 0;
}