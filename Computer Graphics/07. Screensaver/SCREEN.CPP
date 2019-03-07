#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
#include<dos.h>

void main()
{
int gd=DETECT, gm, x, y, i;
initgraph(&gd,&gm,"C:\TurboC3\BIN");
	while(!kbhit()) {
		x=rand();
		y=rand();
		setcolor(i);
		circle(x, y, 10);
		circle(x, y, 6);
		i++;
	}
	getch();
}

