#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct cand {
	char nume[11][30];
	int dim;
}candidati;

void adaugare_candidat()
{
	char numeC[30];
	printf("Nume candidat : ");
	scanf("%29s", numeC);
	int adv = 0;
	//printf("%s", numeC);
	for (int i = 1; i <= candidati.dim && adv ==0; i++)
	{
		if (strcmp(numeC, candidati.nume[i]) == 0)
		{
			adv = 1;
			printf("Candidatul exista\n");
		}

	}
	if (adv == 0) {
		strcpy(candidati.nume[candidati.dim], numeC);
		candidati.dim++;
		printf("Candidat adaugat cu succes\n");
	}
}

void eliminare_candidat()
{
	char numeC[30];
	printf("Nume candidat : ");;
	scanf("%29s", numeC);
	int i,poz=-1;
	for (i = 1; i <= candidati.dim; i++)
	{
		if (strcmp(numeC, candidati.nume[i]) == 0)
			poz = i;
	}
	for (i = poz; i < candidati.dim; i++)
	{
		strcpy(candidati.nume[i], candidati.nume[i+1]);
	}
	candidati.dim--;
	if (poz == -1)
		printf("Candidatul nu exista\n");
	else
		printf("Candidatul a fost eliminat\n");
}

void verificare_candidat()
{
	char numeC[30];
	printf("Nume candidat : ");;
	scanf("%29s", numeC);
	int adv = 0;
	int i;
	for (i = 1; i <= candidati.dim && adv == 0; i++)
		if (strcmp(numeC, candidati.nume[i]) == 0)
		{
			printf("Candidatul este in lista\n");
			adv = 1;
		}
	if (adv == 0)
		printf("Canditatul nu este in lista\n");
}

void afisare()
{
	int i;
	for (i = 1; i <= candidati.dim; i++)
	{
		printf("%s\n", candidati.nume[i]);
	}
}

int main()
{
	int x=5;
	candidati.dim = 1;
	while (x != 0)
	{
		printf("\nAlegeti operatia (Orice alt numar duce la oprire): \n");
		printf("1 . Adaugare canditat\n");
		printf("2 . Eliminarea unui canditat\n");
		printf("3 . Verificare apartenenta\n");
		printf("4 . Afisarea candidatin\n");
		scanf("%d", &x);
		if (x == 1)
			adaugare_candidat();
		if (x == 2)
			eliminare_candidat();
		if (x == 3)
			verificare_candidat();
		if (x == 4)
			afisare();
	}
	return 0;
}