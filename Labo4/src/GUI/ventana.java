/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Abstract.FactoryProducer;
import Aritmetica.Aritmetica;
import Aritmetica.FactoryAritmetica;
import Aritmetica.TiposAritmetica;
import Converter.Converter;
import Converter.FactoryConverter;
import Converter.TipoConversor;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Ricardo Villeda
 */
public class ventana extends JFrame{
    private JTextField caja1, caja2,cajaBinario;
    private JButton btnSuma, btnResta, btnMulti,btnDiv,btnBin;
    Aritmetica ari;
    Converter con;
    public ventana(){
        super("Calculadora");
        initComponent();
    }
    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1 = new JTextField(" ");
        caja1.setBounds(130,10,100,30);
        caja2 = new JTextField(" ");
        caja2.setBounds(250,10,100,30);
        cajaBinario = new JTextField("Ingrese el numero a convertir: ");
        cajaBinario.setBounds(70,250,200,30);
        btnSuma = new JButton("Suma");
        btnSuma.setBounds(150,60,150,30);
        btnResta = new JButton("Restar");
        btnResta.setBounds(150,100,150,30);
        btnMulti = new JButton("Multiplicacion");
        btnMulti.setBounds(150,140,150,30);
        btnDiv = new JButton("Division");
        btnDiv.setBounds(150,180,150,30);
        btnBin = new JButton("Convertir");
        btnBin.setBounds(280,250,100,30);
        Container contenedor = getContentPane();
        contenedor.add(caja1);
        contenedor.add(caja2);
        contenedor.add(cajaBinario);
        contenedor.add(btnSuma);
        contenedor.add(btnResta);
        contenedor.add(btnMulti);
        contenedor.add(btnDiv);
        contenedor.add(btnBin);
        setSize(500,500);
        
        btnSuma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ari = FactoryProducer.getFactory("Operar").getOperacion(TiposAritmetica.Suma);
                JOptionPane.showMessageDialog(rootPane,"El resultado es: "+ari.operar(Double.parseDouble(caja1.getText()),Double.parseDouble(caja2.getText())));
            }
        });
        btnResta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ari = FactoryProducer.getFactory("Operar").getOperacion(TiposAritmetica.Resta);
                JOptionPane.showMessageDialog(rootPane,"El resultado es: "+ari.operar(Double.parseDouble(caja1.getText()), Double.parseDouble(caja2.getText())));
            }
        });
        btnMulti.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ari = FactoryProducer.getFactory("Operar").getOperacion(TiposAritmetica.Multiplicacion);
                JOptionPane.showMessageDialog(rootPane,"El resultado es: "+ari.operar(Double.parseDouble(caja1.getText()), Double.parseDouble(caja2.getText())));
            }
        });
        btnDiv.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                ari = FactoryProducer.getFactory("Operar").getOperacion(TiposAritmetica.Division);
                JOptionPane.showMessageDialog(rootPane,"El resultado es: "+ari.operar(Double.parseDouble(caja1.getText()), Double.parseDouble(caja2.getText())));
            }
        });
        btnBin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               con = FactoryProducer.getFactory("Convertir").getConverter(TipoConversor.Bin);
               JOptionPane.showMessageDialog(rootPane,"La conversion es: "+ con.convertir(Integer.parseInt(cajaBinario.getText())));
            }
        }
        
        );
    }
}
