
package principal;

import com.mycompany.exercicio355.Animal;
import com.mycompany.exercicio355.Ave;
import com.mycompany.exercicio355.Cachorro;

public class Principal {
        
        public static void main(String[] args) {
        
        Animal cachorro1 = new Cachorro();
        System.out.println("Pablo Vittar");
        cachorro1.produzirSom();
        cachorro1.mover();
        
        
        Animal ave1 = new Ave();
        System.out.println("Pablo Escobar");
        ave1.produzirSom();
        ave1.mover();
    }
}
