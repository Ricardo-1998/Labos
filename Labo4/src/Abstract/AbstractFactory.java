/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import Aritmetica.Aritmetica;
import Aritmetica.TiposAritmetica;
import Converter.Converter;
import Converter.TipoConversor;

/**
 *
 * @author Ricardo Villeda
 */
public interface AbstractFactory {
    Aritmetica getOperacion(TiposAritmetica type);
    Converter getConverter(TipoConversor type);
}
