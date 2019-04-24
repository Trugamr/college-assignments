#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	setcolor(WHITE);
	setfillstyle(SOLID_FILL, RED);
	circle(200, 200, 100);
	floodfill(200, 200, WHITE);
	setcolor(5);
	setfillstyle(LINE_FILL, WHITE);
	circle(300, 200, 110);
	floodfill(350, 200, 5);
	getch();
}