String -> no son mutable(inmutable).
	String a = ""; → variables con el mismo valor NO crea un nuevo valor. 
	
	
String a1 = new String(...); → Pero este si crea un nuevo valor.
Devuelve "false" 

HEAP → donde se almecena en memoria objetos.

StringBuffer → si son mutables, es propicio para aplicaciones de más de un hilo de ejecución.

StringBuilder → si son mutables, para aplicaciones para un solo hilo. 
		Como no haremos aplicaciones multihilos usaremos más 
		el StringBuilder.
StringTokenizer →  
