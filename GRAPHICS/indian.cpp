// Write a program to draw Indian Flag.

#include <graphics.h>
#include <conio.h>

void drawIndianFlag() 
{
    setcolor(WHITE);
    rectangle(200, 5, 400, 55);
    setfillstyle(SOLID_FILL, RED); 
    floodfill(201, 6, WHITE);

    rectangle(200, 55, 400, 105);
    setfillstyle(SOLID_FILL, 15); 
    floodfill(201, 56, WHITE);

    setcolor(BLUE);
    int startAngle = 0, endAngle = 15;
    for (int i = 0; i < 24; i++) {
        pieslice(300, 80, startAngle, endAngle, 25); 
        startAngle = endAngle; 
        endAngle += 15;       
    }

    setcolor(WHITE);
    rectangle(200, 105, 400, 155);
    setfillstyle(SOLID_FILL, 2); 
    floodfill(201, 106, WHITE);

    rectangle(195, 5, 200, 477);
    setfillstyle(SOLID_FILL, BROWN); 
    floodfill(196, 6, WHITE);

    ellipse(197, 467, 180, 0, 100, 10);
    line(97, 442, 97, 467);
    line(297, 442, 297, 467);

    ellipse(197, 442, 180, 0, 100, 10);
    line(97, 417, 97, 442);
    line(297, 417, 297, 442);

    ellipse(197, 417, 180, 0, 100, 10);
    line(97, 392, 97, 417);
    line(297, 392, 297, 417);

    ellipse(197, 392, 0, 0, 100, 10);

}

int main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, ""); 

    drawIndianFlag();

    getch();
    closegraph();
    return 0;
}