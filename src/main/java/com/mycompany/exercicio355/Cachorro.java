
package com.mycompany.exercicio355;

    
    public class Cachorro implements Animal {
    
        private String nome;
        
        public Cachorro() {
            this("");
        }
        
        public Cachorro(String nome) {
            this.nome = nome;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
        this.nome = nome;
        
    }
        
        @Override
        public void produzirSom() {
            System.out.println("Latir");
        }
        
        @Override
        public void mover() {
            System.out.println("Andar");
        }
}