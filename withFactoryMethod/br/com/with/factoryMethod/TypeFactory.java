package br.com.with.factoryMethod;

import br.com.with.factory.type.Automóvel;
import br.com.with.factory.type.BattleRoyale;
import br.com.with.factory.type.Esporte;
import br.com.with.factory.type.Guerra;

public class TypeFactory {
	
	public static TypeGame ListGame(int type) {
		
		if(type == 1) 
			return new BattleRoyale();

		if(type == 2) 
			return new Guerra();

		if(type == 3) 
			return new Esporte();

		if(type == 4) 
			return new Automóvel();

		
		return null;
	}

}
