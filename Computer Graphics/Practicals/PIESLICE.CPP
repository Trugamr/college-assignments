#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	setbkcolor(WHITE);
	settextstyle(0, 1, 1);
	setcolor(8);
	outtextxy(20, 10, "HELLO");
	pieslice(getmaxx()/2, getmaxy()/2, 0, 90, 100);
	pieslice(getmaxx()/2, getmaxy()/2, 90, 180, 80);
	pieslice(getmaxx()/2, getmaxy()/2, 180, 270, 50);
	pieslice(getmaxx()/2, getmaxy()/2, 270, 360, 30);v
	getch();
}