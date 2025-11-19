// Write a program to draw Chess Board.

#include <graphics.h>

int main() {
  int gm, gd;
  gm = gd = DETECT;
  initgraph(&gm, &gd, NULL);
  int x1 = 100, y1 = 50, x2 = 500, y2 = 450;

  for (int i = 0; i < 8; i++) {
    rectangle(x1, y1, x2, y2);
    x2 -= 50;
    y2 -= 50;
  }

  x1 = 100, y1 = 50, x2 = 500, y2 = 450;
  for (int i = 0; i < 8; i++) {
    rectangle(x1, y1, x2, y2);
    x1 += 50;
    y1 += 50;
  }

  int x = 110, y = 0;
  setfillstyle(SOLID_FILL, WHITE);

  for (int k = 0; k < 4; k++) {
    x = 110;
    y += 60;
    for (int i = 0; i < 4; i++) {
      floodfill(x, y, WHITE);
      x += 100;
    }

    x = 160;
    y += 50;
    for (int i = 0; i < 4; i++) {
      floodfill(x, y, WHITE);
      x += 100;
    }
  }
  getch();
  closegraph();
}
