
// 1. Declarar el tipo de dato

//cuando trabajamos rangos NO usa el switch.

public class EnumEjercicios_1 {

  enum DiasLaborables {
  monday,
  tuesday,
  wednesday,
  thursday,
  friday,
  saturday,
  sunday,

}
  
  public static void main (String [] args){
    DiasLaborables dia = DiasLaborables.monday;
    switch(dia){
      case monday: 
	System.out.println("Es Monday");
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
