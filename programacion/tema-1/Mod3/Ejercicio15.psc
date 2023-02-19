Algoritmo FactorialConFuncion
	//Entorno
	num Es Entero //N debe ser entero positivo, es decir, debe ser un numero natural
	fact Es Entero
	//Sentencias
	Escribir "Introduce un número positivo"
	Leer num
	si num Es Mayor O Igual A 0 Entonces
		fact <- factorial (num)
		Escribir "Resultado ", fact
	sino
			Escribir "Error, numero negativo"
	FinSi
	
FinAlgoritmo

Funcion f <- factorial (n)
	f Es Entero
	f<-1
	Si n=0 
		f <- 1
	sino 
		Repetir
			f <- f * n
			n<- n-1
		Hasta Que n Es Menor O Igual A 1
	FinSi
FinFuncion
//Funcion f <- factorial(num)
//f<-1
//contador<-1
//mientras contador<=num Hacer
//	f = f*contador
//	contador<-contador+1
//FinMientras 
//FinFuncion
