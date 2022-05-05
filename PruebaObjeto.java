
package pruebaobjeto;

public class PruebaObjeto {

        public static void main(String[] args) {
         
           Player jugador1 = new Player();
           Player jugador2 = new Player (1, 23, "Martin", "Palermo", "delantero", false);
           
            System.out.println(jugador2.toString());
            System.out.println(jugador1.toString());
            
            
           
           /*jugador2.atacar();
           jugador2.defender();
           jugador2.rematar(3);*/
           
           /*System.out.println("Martin Palermo juega con el " + jugador2.getNumero_camiseta() + " en la espalda");
           jugador2.setNumero_camiseta(9);
           System.out.println("Martin Palermo juega con el " + jugador2.getNumero_camiseta() + " en la espalda");
            */
                   
                   
                   }
    
}
