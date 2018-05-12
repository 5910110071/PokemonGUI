/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author Core I7
 */
public class Koduck extends Pokemon implements Swimmable,Run {
    private static final int maxGroupHealth = 270;
    public Koduck(){
		super("Koduck",
		      (Math.random()*1000) % (maxGroupHealth+1),(Math.random()*1000)%100+50);

		this.attackSkill = PokemonSkill.getPokemonSkill("Tail Whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

	

	public void swim(){
		this.reducedWeight(10);
	}
        
        public void move(){
		this.swim();
	}
        public void run(){
		this.reducedWeight(10);
	}

	public void walk(){
		this.reducedWeight(1);
	}

}
