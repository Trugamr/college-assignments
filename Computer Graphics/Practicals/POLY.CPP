#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	int triangle[] = {200, 200, 250, 300, 150, 300, 200, 200};
	//drawpoly(4, triangle);
	setfillstyle(LINE_FILL, RED);
	fillpoly(4, triangle);
	getch();
}