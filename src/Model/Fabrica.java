package Model;

import DTO.DtoUser;
/**
 * padrao Factory method utlizado para suprir as diferentes formas de criaçao
 * 
 * 
 * */
public interface Fabrica {
	
	public abstract boolean criar(DtoUser user);
	
}