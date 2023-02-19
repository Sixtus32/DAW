Algoritmo Ecuacion2Grado
	//Una ecuaci�n de 2� grado => ax2 + bx + c = 0
	//Se resuelve despejando x => x=(-b +- Raiz(b2-4ac))/2a
	//Donde b2-4ac se denomina discriminante
	//Si discriminante > 0 habr� dos soluciones para x, x1 y x2
	//Si discriminante=0 habr� una soluci�n doble x1=x2
	//Si discriminante<0 no hay soluciones reales 
	
	//Entorno
	Definir a,b,c,x1,x2,discriminante Como Real 	
	escribir "Introduce los coeficientes de la ecuaci�n:"
	escribir " a " 
	leer a
	escribir " b "
	leer b
	escribir " c "
	leer c
	discriminante= b*b-4*a*c
	si (discriminante>0) entonces
		x1=(-b+raiz(discriminante))/(2*a)
		x2=(-b-raiz(discriminante))/(2*a)
	escribir "Hay dos soluciones: x1=", x1 ,"  x2=",x2
	sino
		si (discriminante=0) entonces
			x1=-b/(2*a)
		escribir "Hay una soluci�n: ", x1
		sino
			escribir "No hay soluci�n real"
		finsi
	finsi
FinAlgoritmo
