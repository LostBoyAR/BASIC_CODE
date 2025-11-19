#include <graphics.h>
#include <conio.h>


int main() {
    int gd, gm;
    gd = gm = DETECT;
    initgraph(&gd, &gm, "");
    
    setcolor(WHITE);
    circle(200, 200, 50);

    delay(1000);
    setcolor(BLACK);
    circle(200, 200, 50);

    //delay(1000);
    setcolor(WHITE);
    circle(200 + 200, 200 + 200 , 50);

    getch();
    closegraph();
    return 0;
}