/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author Alejandro
 */
public interface AttributeExtractor <Entity, Attribute>{
    
    public Attribute extract(Entity entity);
}
