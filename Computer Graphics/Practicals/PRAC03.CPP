#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<graphics.h>
#include<dos.h>
void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	int r, border, i;
	i = 0;
	int flag = 1;
	while(!kbhit()) {
		sleep(0.6);
		border = rand();
		r = i;
		setcolor(border);
		setfillstyle(SOLID_FILL, border);
		circle(320, 240, r);
		floodfill(r-1, 0, border);
		if(r == 320) { flag = 0; }
		if(r == 0) { flag = 1;}
		if(flag) {i += 10;}
		else { i -= 10; }

	}
	getch();
}