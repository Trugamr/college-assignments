#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	int hill[] = {0, 140, 98, 10, 198, 100, 246, 45, 358, 116, 396, 35, 446, 140};
	int roof[] = {237, 235, 275, 188, 387, 188, 422, 235};
	int tree[] = {108, 244, 144, 281, 118, 281, 144, 305, 118, 305, 144, 330, 73, 330, 97, 305, 73, 305, 97, 280, 73, 280, 108, 244};
	initgraph(&gd, &gm, "C:\TurboC3\BIN");

	//road
	setfillstyle(SOLID_FILL, LIGHTGRAY);
	line(295, 480, 640, 260);
	line(465, 480, 640, 340);
	floodfill(440, 440, WHITE);

	//hills
	setfillstyle(HATCH_FILL, BROWN);
	line(0, 140, 640, 140);
	drawpoly(7, hill);
	floodfill(260, 100, WHITE);
	line(423, 90, 490, 20);
	line(490, 20, 640, 140);
	floodfill(440, 80, WHITE);

	//hut
	circle(275, 216, 8);
	setfillstyle(SOLID_FILL, BLUE);
	rectangle(237, 235, 313, 330);
	floodfill(260, 260, WHITE);
	setfillstyle(SOLID_FILL, BROWN);
	rectangle(263, 297, 286, 330);
	floodfill(275, 300, WHITE);
	setfillstyle(SOLID_FILL, BLUE);
	rectangle(313, 235, 423, 330);
	floodfill(360, 280, WHITE);
	setfillstyle(BKSLASH_FILL, RED);
	drawpoly(4, roof);
	floodfill(350, 200, WHITE);
	setfillstyle(XHATCH_FILL, RED);
	line(275, 188, 313, 235);
	floodfill(295, 225, WHITE);



	//tree
	setfillstyle(LTSLASH_FILL, GREEN);
	drawpoly(12, tree);
	floodfill(110, 275, WHITE);

	setfillstyle(SOLID_FILL, BROWN);
	rectangle(102, 330, 113, 374);
	floodfill(105, 335, WHITE);

	getch();
}