Algoritmo sin_titulo
	Definir c1,c2,c3,c4, contador Como Entero
	Definir altura Como Real
	contador<-0
	Repetir 
		Escribir "Introduce una altura"
		Leer altura
		contador <-contador+1
		si altura<160 Entonces
			c1<-c1+1
		sino 
			si altura >=160 y altura <170 Entonces
				c2<-c2+1
			sino 
				si altura >= 170 y altura <=180 Entonces
					c3<-c3+1
				sino 
					si altura > 180 Entonces
						c4<-c4+1
					FinSi
						
				FinSi
			FinSi
		
		FinSi
		
	Hasta Que contador=5
	
	Escribir c1 " miden menos de 160" 
	Escribir c2 " miden entre 160 y 170" 
	Escribir c3 " miden entre 170 y 180" 
	Escribir c4 " miden más de 180" 
FinAlgoritmo