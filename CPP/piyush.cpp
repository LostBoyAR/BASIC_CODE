#include<stdio.h>
#include<graphics.h>

int main(){
    int gm ,gd;
    int x1 = 200, y1 = 50, x2 = 260, y2 = 200;
    gm = gd = DETECT;
    initgraph(&gm,&gd," ");

    rectangle(50,50,400,400);
    setfillstyle(SOLID_FILL,RED);
    rectangle(50,50,200,200);
    floodfill(51,51,WHITE);

    setfillstyle(SOLID_FILL,RED);
    circle(100,100,10);
    floodfill(101,101,WHITE);
    circle(140,100,10);
    floodfill(141,101,WHITE);
    circle(100,140,10);
    floodfill(101,141,WHITE);
    circle(140,140,10);
    floodfill(141,141,WHITE);

    setfillstyle(SOLID_FILL,WHITE);
    rectangle(75,75,175,175);
    floodfill(76,76,WHITE);

    for(int i =1;i<=6;i++){
    rectangle(x1,y1,x2,y2);
    y2-=25;
    }

    line(220,50,220,200);
    line(240,50,240,200);

    rectangle(200,50,400,200);
    rectangle(275,75,375,175);

    circle(300,100,10);
    circle(340,100,10);
    circle(300,140,10);
    circle(340,140,10);

    int a1 = 260, b1 = 200, a2 = 400, b2 = 260;

    for(int i =1;i<=6;i++){
     rectangle(a1,b1,a2,b2);
             a2-=23;
        }

        line(260,220,400,220);
        line(260,240,400,240);

        rectangle(260,260,400,400);
        rectangle(285,285,375,375);

        circle(310,310,10);
        circle(350,310,10);
        circle(310,350,10);
        circle(350,350,10);

    int c1 =200, d1 = 260, c2 = 260, d2 = 400;
    for(int i =1;i<=6;i++){
        rectangle(c1,d1,c2,d2);
        d2-=23;
    } 
    
    line(220,260,220,400);
    line(240,260,240,400);

    rectangle(50,260,200,400);
    rectangle(75,285,175,375);

    circle(100,310,10);
    circle(140,310,10);
    circle(100,350,10);
    circle(140,350,10);


    int e1 = 50, f1 = 200, e2 = 200, f2 = 260;
    for(int i =1;i<=6;i++){
        rectangle(e1,f1,e2,f2);
        e2-=25;
    }

    line(50,220,200,220);
    line(50,240,200,240);
    
    rectangle(200,200,260,260);

    
    
    getch();
    closegraph();
}