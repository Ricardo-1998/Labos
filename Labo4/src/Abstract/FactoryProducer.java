/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import Aritmetica.FactoryAritmetica;
import Converter.FactoryConverter;

/**
 *
 * @author Ricardo Villeda
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Operar":
                return  new FactoryAritmetica();
            case "Convertir":
                return new FactoryConverter();
        }
        return null;
    }
}
