#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TURBOC3\BIN");

	setfillstyle(SOLID_FILL, YELLOW);
	circle(320, 240, 80);
	floodfill(320, 240, WHITE);

	setfillstyle(LINE_FILL, RED);
	circle(320, 240, 140);
	floodfill(320, 360, WHITE);

	setfillstyle(HATCH_FILL, WHITE);
	circle(320, 240, 200);
	floodfill(320, 400, WHITE);

	getch();
}