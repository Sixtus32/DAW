Algoritmo Ejercicio6
	definir a,b,c, x1, x2, discriminante Como Real
	escribir "valor de a : "
	leer a
	escribir "valor de b : "
	leer b
	escribir "valor de c : "
	leer c
	discriminante=b*b-4*a*c
	
	si (discriminante > 0) Entonces
		x1=(-b+raiz(discriminante)) / (2*a)
		x2=(-b+raiz(discriminante)) / (2*a)
		escribir "Hay dos soluciones. x1 = ", x1, " y x2 = ", x2
	SiNo
		si(discriminante = 0) Entonces
			x1=-b/(2*a)
			escribir "Hay una solución : ", x1
		sino 
			escribir "No hay solución real."
		FinSi
	FinSi
	
FinAlgoritmo
