#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	int body[] = {92, 294, 119, 222, 200, 222, 258, 154, 417, 154, 440, 222, 498, 222, 498, 294, 92, 294};
	int window1[] = {232, 215, 266, 172, 325, 172, 325, 215, 232, 215};
	int window2[] = {345, 215, 345, 172, 400, 172, 415, 215, 345, 215};
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	setfillstyle(SOLID_FILL, RED);
	drawpoly(9, body);
	floodfill(275, 250, WHITE);
	setfillstyle(SOLID_FILL, BLUE);
	drawpoly(5, window1);
	drawpoly(5, window2);
	floodfill(285, 194, WHITE);
	floodfill(378, 194, WHITE);
	//tires
	setfillstyle(SOLID_FILL, WHITE);
	circle(220, 294, 35);
	circle(400, 294, 35);
	floodfill(220, 300, WHITE);
	floodfill(220, 280, WHITE);
	floodfill(400, 300, WHITE);
	floodfill(400, 280, WHITE);
	getch();
}