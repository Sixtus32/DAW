Algoritmo sin_titulo
	//Entorno
	Definir a,b,c Como Entero 
	escribir "Introduce tres numeros:"
	leer a,b,c
	si (a<b) entonces
		si (b<c) entonces
			escribir  "a<b<c"
		sino 
			si (b=c) entonces
				escribir  "a<b=c"
			sino 
				si (a<c) entonces
					escribir  "a<c<b"
				sino
					si (a=c) entonces
						escribir "a=c<b"
					sino
						escribir "c<a<b"
					finsi
				finsi
			finsi
		finsi
	sino
		si (a=b) entonces
			si (a<c) entonces
				escribir "a=b<c"
			sino
				si (c<a) entonces
					escribir "c<b=a"
				sino
					escribir "a=b=c"
				finsi
			finsi
		sino
			si(a<c) entonces
				escribir "b<a<c"
			sino
				si (a=c) entonces
					escribir "b<a=c"
				sino
					si (c<b) entonces
						escribir "c<b<a"
					sino 
						si (c=b) entonces
							escribir "b=c<a"
						sino
							escribir "b<c<a"
						finsi
					finsi
				finsi
			finsi
		finsi
	finsi
FinAlgoritmo
