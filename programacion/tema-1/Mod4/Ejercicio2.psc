//Los m�ltiplos de un n�mero son n�meros de igual o mayor tama�o que contienen al mismo n�mero una cantidad exacta de veces. De hecho, cuando se calcula el m.c.m. de dos n�meros estamos calculando el menor m�ltiplo com�n de ambos.
//Como hallar los m�ltiplos de un n�mero:
//Para hallar un m�ltiplo de un n�mero natural basta con multiplicarlo por otro n�mero natural.
//Por ejemplo, para calcular los cinco primeros de 3:
//			3�1=3   			3�2=6 			3�3=9 			3�4=12 			3�5=15
//			Y podremos decir que son 3, 6, 9, 12 y 15.
//			Todo n�mero natural es m�ltiplo de s� mismo y de 1.
//			Cualquier n�mero distinto de 0 tiene infinitos m�ltiplos.
//			El n�mero 0 s�lo tiene un m�ltiplo, el 0.

Algoritmo multiplosdeunnumero
	Definir numero1,numero2 Como Entero
	Definir sonMultiplos Como Logico
	Escribir "Introduce dos numeros"
	Leer numero1, numero2
	sonMultiplos <-esMultiplo(numero1,numero2)
	Si sonMultiplos = VERDADERO Entonces
		Escribir "Alguno de ellos es multiplo del otro"
	FinSi

FinAlgoritmo

Funcion resultado <- esMultiplo(num1,num2)
	Definir suma,elnumero,elmultiplo Como Entero
	Definir resultado Como Logico
	suma<-0
	Si num1 > num2 Entonces
		elnumero<-num1
		elmultiplo<-num2
	SiNo
		elnumero<-num2
		elmultiplo<-num1
	FinSi
	Escribir elnumero
	Escribir elmultiplo
	Mientras suma<elnumero Hacer
		suma<-suma + elmultiplo
	FinMientras
	Si suma = elnumero Entonces
		resultado<-Verdadero

	Sino 
		resultado<-Falso //Se puede omiti

	FinSi
FinFuncion

