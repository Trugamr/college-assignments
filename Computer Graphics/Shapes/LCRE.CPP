#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main() {
	int gd = DETECT, gm;
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	printf("\n\n  1. Line\n  2. Circle\n  3. Ellipse\n  4. Rectangle\n\n  Select what to draw: ");
	int option;
	scanf("%d", &option);
	switch(option) {
		case 1: line(100, 100, 500, 100);
			break;
		case 2: circle(320, 240, 100);
			break;
		case 3: ellipse(320, 240, 0, 360, 100, 60);
			break;
		case 4: rectangle(220, 180, 420, 300);
			break;
		default: printf("  Option not found");
	}
	getch();
}