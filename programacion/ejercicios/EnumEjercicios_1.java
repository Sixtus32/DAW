
    // 1. Declarar el tipo de dato
enum Days {
  monday,
  tuesday,
  wednesday,
  thursday,
  friday,
  saturday,
  sunday,
} 

enum DiasLaborables {
  monday,
  tuesday,
  wednesday,
  thursday,
  friday,
  saturday,
  sunday,

}

//cuando trabajamos rangos NO usa el switch.

public class EnumEjercicios_1 {
  
  public static void main (String [] args){

    DiasLaborables dia = DiasLaborables.monday;

    switch(dia){
      case monday: 
	System.out.println("Is Monday");
	break;
      case tuesday:
      case wednesday:
      case thursday:
	System.out.println("Are day of the weeks");
	break;
      case friday:
	System.out.println("Is near weekend");
	break;
      default:
	System.out.println("Is weekend");
    }

  }
}
