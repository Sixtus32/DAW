//Algoritmo principal
Algoritmo SinProgrModular
	Definir radio  Como Real
	Escribir "Introduce el radio"
	Leer radio
	Escribir "El area es " area(radio)
	
	circunferencia(radio)
	
	Escribir "El radio leido es " radio
	circunferencia2(radio)
	Escribir "Ahora radio=circunferencia vale " radio
FinAlgoritmo

//Ejemplo de funcion
Funcion a <- area (n)
	a <- PI*n*n
FinFuncion
//Ejemplo de procedimiento con paso por valor
Funcion circunferencia(n)
	c <- 2*PI*n
	Escribir "La circunferencia es " c
FinFuncion
//Ejemplo de procedimiento con paso por referencia
Funcion circunferencia2(n Por Referencia)
	n<-2*PI*n
FinFuncion
	