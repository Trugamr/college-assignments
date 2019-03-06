#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	line(160, 240, 480, 240);
	ellipse(240, 240, 0, 180, 80, 140);
	ellipse(400, 240, 180, 360, 80, 140);
	getch();
}