
// This program demonstrates the translation of a circle using the graphics library in C++.
#include <graphics.h>
#include <conio.h>

int main() {
    int gd = DETECT, gm;
    int x = 200, y = 200, r = 50, tx = 5, ty = 5;
    initgraph(&gd, &gm, "");

    setcolor(WHITE);
    circle(x, y, r);

    for (int i = 0; i < 50; i++) {
        delay(100);
        setcolor(BLACK);
        circle(x, y, r); 

        x += tx;
        y += ty;

        setcolor(WHITE);
        circle(x, y, r);
    }

    getch();
    closegraph();
    return 0;
}

