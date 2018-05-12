package pokemongame;

public class Pikachu extends Pokemon implements Run{
	private static final int maxGroupHealth = 200;
	public Pikachu(){
		super("Picachu",
		      (Math.random()*1000) % (maxGroupHealth+1),(Math.random()*1000)%100+50);

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedWeight(10);
	}

	public void walk(){
		this.reducedWeight(1);
	}
}
