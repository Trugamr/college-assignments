#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TURBOC3\BIN");
	setfillstyle(SOLID_FILL, BLUE);
	rectangle(120, 40, 320, 140);
	floodfill(220, 90, WHITE);

	setfillstyle(SOLID_FILL, GREEN);
	rectangle(320, 40, 520, 140);
	floodfill(420, 90, WHITE);

	setfillstyle(SOLID_FILL, CYAN);
	rectangle(120, 140, 320, 240);
	floodfill(220, 190, WHITE);

	setfillstyle(SOLID_FILL, RED);
	rectangle(320, 140, 520, 240);
	floodfill(420, 190, WHITE);

	setfillstyle(SOLID_FILL, MAGENTA);
	rectangle(120, 240, 320, 340);
	floodfill(220, 290, WHITE);

	setfillstyle(SOLID_FILL, BROWN);
	rectangle(320, 240, 520, 340);
	floodfill(420, 290, WHITE);

	setfillstyle(SOLID_FILL, YELLOW);
	rectangle(120, 340, 320, 440);
	floodfill(220, 390, WHITE);

	setfillstyle(SOLID_FILL, WHITE);
	rectangle(320, 340, 520, 440);
	floodfill(420, 390, WHITE);

	getch();

}