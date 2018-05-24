/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author Ricardo Villeda
 */
public class Binario implements Converter {
    

    @Override
    public String convertir(int a) {
        String binario = Integer.toBinaryString(a);
        return(binario);
    }
}
