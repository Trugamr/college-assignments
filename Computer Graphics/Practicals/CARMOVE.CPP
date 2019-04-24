#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<dos.h>

void main() {
	int gd = DETECT, gm, i;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	for(i=0; i<640; i+=2) {
		// road
		line(0, 375, 640, 375);
		// body frame
		int outerBody[] = {75+i, 345, 75+i, 300, 120+i, 270, 160+i, 225, 290+i, 225, 335+i, 300, 370+i, 300, 370+i, 345, 340+i, 345};
		drawpoly(8, outerBody);
		// bottom
		line(75+i, 345, 115+i, 345);
		line(175+i, 345, 275+i, 345);
		line(335+i, 345, 370+i, 345);
		// tires
		arc(145+i, 345, 0, 180, 30);
		arc(305+i, 345, 0, 180, 30);
		circle(145+i, 345, 26);
		circle(305+i, 345, 26);
		delay(10);
		cleardevice();
	}
	getch();
}