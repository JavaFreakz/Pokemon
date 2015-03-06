package Monsters;
 
public class ElementType {
	
	public static final ElementType BUG = new ElementType("Bug");
	public static final ElementType DRAGON = new ElementType("Dragon");
	public static final ElementType ELECTRIC = new ElementType("Electric");
	public static final ElementType FIRE = new ElementType("Fire");
	public static final ElementType FLYING = new ElementType("Flying");
	public static final ElementType GHOST = new ElementType("Ghost");
	public static final ElementType GRASS = new ElementType("Grass");
	public static final ElementType GROUND = new ElementType("Ground");
	public static final ElementType NORMAL = new ElementType("Normal");
	public static final ElementType POISON = new ElementType("Poison");
	public static final ElementType PSYCHIC = new ElementType("Psychic");
	public static final ElementType ROCK = new ElementType("Rock");
	public static final ElementType WATER = new ElementType("Water");
	
	private String element;
	private ElementType[] weakAgainst;
	private ElementType[] superAgainst;
	private ElementType[] noEffect;
	
	private ElementType() {}
	
	private ElementType(String name)
	{
		element = name;
	}
	
	protected void setInteractions(ElementType[] weaknesses, ElementType[] supers, ElementType[] cantHit)
	{
		int i = 0;
		weakAgainst = new ElementType[weaknesses.length];
		for(ElementType typ : weaknesses)
		{
			weakAgainst[i++] = typ;
		}

		i = 0;
		superAgainst = new ElementType[supers.length];
		for(ElementType typ : supers)
		{
			superAgainst[i++] = typ;
		}

		i = 0;
		noEffect = new ElementType[cantHit.length];
		for(ElementType typ : cantHit)
		{
			noEffect[i++] = typ;
		}
	}
}
