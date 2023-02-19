Algoritmo FactorialRecursivo
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

Funcion f <- factorial (n )
	f Es Entero	
	si n=0 Entonces
		f<-1
	sino 
		f<- n*factorial(n-1)
	FinSi
FinFuncion
