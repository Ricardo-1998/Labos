/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import Abstract.AbstractFactory;
import Converter.Converter;
import Converter.TipoConversor;

/**
 *
 * @author Ricardo Villeda
 */
public class FactoryAritmetica implements AbstractFactory{
    

    
    @Override
    public Aritmetica getOperacion(TiposAritmetica type) {
        switch (type) {
            case Suma:
                return new Suma ();
            case Resta:
                return new Resta();
            case Division:
                return new Division();
            case Multiplicacion:
                return new Multiplicacion();
        }
        return null;
    }

    @Override
    public Converter getConverter(TipoConversor type) {
        return null;
    }
}
