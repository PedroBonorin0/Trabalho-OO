
package ufjf.dcc025.trabalho.fightingduel;

public class Combate {
    
    protected int modificadorAtaque; // Quantidade de modificadores de ataque restantes 
    protected int modificadorDefesa; // Quantidade de modificadores de defesa restantes
    
    protected int quemInicia(){return 0;} // Será retornado um valor entre 1 e 2 para ver qual jogador ataca primeiro
    
    protected void ataque(){} // Jogador do turno decide atacar
    
    protected void defesa(){} // Jogador do turno decide defender
}
