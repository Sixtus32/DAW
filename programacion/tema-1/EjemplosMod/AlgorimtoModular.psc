//Algoritmo principal
Algoritmo Modular
	Definir radio, perim Como Real
	Escribir "Introduce el radio"
	Leer radio
	//Invocamos a la funcion area a la que le pasamos el radio como parámetro o dato de entrada
	//Podemos imprimir lo que devuelve una funcion
	Escribir "El area es " area(radio)
	
	//Tambien podemos recoger en una variable lo que devuelve la función
	perim <- perimetro(radio)
	Escribir "El perimetro devuelto para el radio " radio " es " perim
FinAlgoritmo

//Funcion que dado un radio de valor n devuelve el area
//n es un dato de entrada a este subproceso y representa el radio
Funcion a <- area (n)
	Definir a como Real
	a <- PI*n*n
FinFuncion
//Funcion que dado un radio de valor n devuelve el perimetro
//n es un dato de entrada a este subproceso y representa el radio
Funcion p <- perimetro(n)
	Definir p como Real
	p <- 2*PI*n
FinFuncion

	