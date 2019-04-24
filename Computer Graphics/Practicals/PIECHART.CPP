#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<string.h>
#include<iostream.h>

void main() {
	clrscr();
	int gd = DETECT, gm, n, i, p = 1, c = 1, item[10];
	float stangle, endangle, angle[10], sum = 0.0;
	printf("Enter No. of Items ");
	scanf("%d", &n);
	for(i=0; i<n; i++) {
		printf("Enter value for Item %d ", i+1);
		scanf("%d", &item[i]);
		sum = sum + item[i];

	}
	for(i=0; i<n; i++) {
		angle[i] = 360*(item[i]/sum);
	}
	stangle = 0.0;
	endangle = angle[0];
	//for(i = 0; i < n; i++) {
	//	printf("%d ", item[i]);
	//}
	initgraph(&gd, &gm, "C:\TurboC++\Disk\TurboC3\BIN");
	int textX = 30;
	int textY = getmaxy() - 30;
	for(i=0; i<n; i++) {
		setfillstyle(p, c);
		if(i == n-1) {
			endangle = 360;
		}
		pieslice(getmaxx()/2, getmaxy()/2, stangle, endangle, 100);
		stangle = endangle;
		endangle += angle[i+1];
		p++;
		c++;

	}
	getch();
}