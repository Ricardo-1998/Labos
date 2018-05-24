/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Abstract.AbstractFactory;
import Aritmetica.Aritmetica;
import Aritmetica.TiposAritmetica;

/**
 *
 * @author Ricardo Villeda
 */
public class FactoryConverter implements AbstractFactory{
    
    @Override
    public Converter getConverter(TipoConversor type) {
        return new Binario();
        
    }

    @Override
    public Aritmetica getOperacion(TiposAritmetica type) {
        return null;
    }

    
    
}
