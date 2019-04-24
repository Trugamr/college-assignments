#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	setcolor(5);
	line(100, 100, 100, 400);
	line(100, 250, 500, 250);
	setcolor(5);
	setfillstyle(LINE_FILL, 5);
	ellipse(200, 250, 0, 180, 100, 120);
	ellipse(400, 250, 180, 0, 100, 120);
	floodfill(200, 200, 5);
	floodfill(400, 300, 5);
	getch();
}