package interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import datos.Encargado_Ventas;
import datos.Venta;


public class Main {

	public static void main(String[] args) {
		LinkedList<Venta> Lista_De_Ventas = new LinkedList<Venta>();
		Encargado_Ventas Encargado = new Encargado_Ventas("Giuliano","Alegre","43987938");
		String cafe = null;
		int cantidad;
		int cont=0;
		boolean tarjeta_socio;
		double recaudación_total=0;
		double total=0;
		int flag=1000000000;
		for (int i = 0; i < flag; i++) {
			
		int opcion= JOptionPane.showOptionDialog( null,"Seleccione que cafe quiere tomar \nLatte : $1,50\r\n"
				+ "Flat White: $2,50\r\n"
				+ "Lágrima: $1,30\r\n"
				+ "Expresso: $:1.00\r\n",
				  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,null,
				  new Object[] { "Latte", "Flat White", "Lágrima","Expresso"}, null);
        switch (opcion){

            case 0 :{
                JOptionPane.showMessageDialog(null,"Usted eligió el cafe Latte");
                //Latte : $1,50
                cafe="Latte";
                total= total +1.50;
                break;

            }

            case 1:{

                JOptionPane.showMessageDialog(null,"Usted eligió el cafe Flat White");
                //Flat White: $2,50
                cafe="Flat White";
                total= total +2.50;
                break;

            }

            case 2:{

               JOptionPane.showMessageDialog(null,"Usted eligió el cafe Lágrima");
                //Lágrima: $1,30
                cafe="Lágrima";
                total= total +1.30;
                break;

            }
            
            case 3:{
            	
            	JOptionPane.showMessageDialog(null,"Usted eligió el cafe Expresso");
            	 //Expresso: $:1.00
            	cafe="Expresso";
            	total= total +1.00;
            	break;
            }

 

      }//cierra SWITCH*/
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos cafe va a llevar"));
        
        total= total*cantidad;
        
        int resp=JOptionPane.showConfirmDialog(null,"El cliente es socio?");
        if (JOptionPane.OK_OPTION == resp){
        	JOptionPane.showMessageDialog(null,"Se le hizo el descuento con exito");
		total=total-total*0.15; 
		tarjeta_socio=true;
   }
        else{
        	JOptionPane.showMessageDialog(null,"No tiene descuento");
        	tarjeta_socio=false;
      total=total;
     }
        Lista_De_Ventas.add( new Venta(cont++,cafe,cantidad,tarjeta_socio));
        
        recaudación_total= recaudación_total + total;
        
     
        int respuesta_finalisima=JOptionPane.showConfirmDialog(null,"Desea agregar otra venta?");
        if (JOptionPane.OK_OPTION == respuesta_finalisima){
        	JOptionPane.showMessageDialog(null," Ingrese otra venta");
		total=0;
   }
        else{
        	i=1000000000;
     }
       
		}
		JOptionPane.showMessageDialog(null, " Lo recaudado del dia de hoy es "+ recaudación_total );
		int Bandera=1000000000;
		for (int i = 0; i < Bandera; i++) {
		int MenuFinal= JOptionPane.showOptionDialog( null,"Seleccione Una de las siguientes opciones \n1-Ver Todas las Ventas\r\n"
				+ "2-Ver La recaudacion total\r\n"
				+ "3-Ver Las ventas con descuento\r\n"
				+ "4-Borrar venta\r\n"
				+ "5-Ver cafe Mas vendido\r\n",
				  "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,null,
				  new Object[] { "1", "2", "3","4","5"}, null);
        switch (MenuFinal){

            case 0 :{
            	Encargado.MostrarVentas(Lista_De_Ventas);
            	 int respuesta_final=JOptionPane.showConfirmDialog(null,"Desea Hacer Algo Mas?");
                 if (JOptionPane.OK_OPTION == respuesta_final){
         		
            }
                 else{
                 	JOptionPane.showMessageDialog(null,"Gracias por Venir, vuelva pronto");
                 	i=1000000000;
              }
                break;

            }

            case 1:{
            	JOptionPane.showMessageDialog(null, " Lo recaudado del dia de hoy es "+ recaudación_total );
            	 int respuesta_final=JOptionPane.showConfirmDialog(null,"Desea Hacer Algo Mas?");
                 if (JOptionPane.OK_OPTION == respuesta_final){
         		
            }
                 else{
                 	JOptionPane.showMessageDialog(null,"Gracias por Venir, vuelva pronto");
                 	i=1000000000;
              }
                break;

            }

            case 2:{

            	Encargado.MostrarDescuentos(Lista_De_Ventas);
               int respuesta_final=JOptionPane.showConfirmDialog(null,"Desea Hacer Algo Mas?");
               if (JOptionPane.OK_OPTION == respuesta_final){
       		
          }
               else{
               	JOptionPane.showMessageDialog(null,"Gracias por Venir, vuelva pronto");
               	i=1000000000;
            }
                break;

            }
            
            case 3:{
            	
            	
            	 int respuesta_final=JOptionPane.showConfirmDialog(null,"Desea Hacer Algo Mas?");
                 if (JOptionPane.OK_OPTION == respuesta_final){
         		
            }
                 else{
                 	JOptionPane.showMessageDialog(null,"Gracias por Venir, vuelva pronto");
                 	i=1000000000;
              }
            	break;
            }

           case 4:{
        	   Encargado.SacarCafeMasVendido(Lista_De_Ventas);
          	 int respuesta_final=JOptionPane.showConfirmDialog(null,"Desea Hacer Algo Mas?");
             if (JOptionPane.OK_OPTION == respuesta_final){
     		
        }
             else{
             	JOptionPane.showMessageDialog(null,"Gracias por Venir, vuelva pronto");
             	i=1000000000;
          }
            	break;
            }

      }//cierra SWITCH*/
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
