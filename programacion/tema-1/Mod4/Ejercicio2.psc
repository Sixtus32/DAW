//Los múltiplos de un número son números de igual o mayor tamaño que contienen al mismo número una cantidad exacta de veces. De hecho, cuando se calcula el m.c.m. de dos números estamos calculando el menor múltiplo común de ambos.
//Como hallar los múltiplos de un número:
//Para hallar un múltiplo de un número natural basta con multiplicarlo por otro número natural.
//Por ejemplo, para calcular los cinco primeros de 3:
//			3·1=3   			3·2=6 			3·3=9 			3·4=12 			3·5=15
//			Y podremos decir que son 3, 6, 9, 12 y 15.
//			Todo número natural es múltiplo de sí mismo y de 1.
//			Cualquier número distinto de 0 tiene infinitos múltiplos.
//			El número 0 sólo tiene un múltiplo, el 0.

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

