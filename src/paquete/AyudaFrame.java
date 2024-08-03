/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package paquete;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Carlo
 */
public class AyudaFrame extends JFrame{
    private JTextArea txtAyuda;
    
    public AyudaFrame (){
        setTitle("Ayuda");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        txtAyuda = new JTextArea();
        txtAyuda.setEditable(false);
        txtAyuda.setText("Instrucciones para usar la calculadora:\\n\\n\" +\n" +
"                          \"1. Ingrese los números en los campos correspondientes.\\n\" +\n" +
"                          \"2. Seleccione la operación deseada: suma, resta, multiplicación o división.\\n\" +\n" +
"                          \"3. Presione el botón 'Calcular' para obtener el resultado.\\n\" +\n" +
"                          \"4. Puede guardar la operación y el resultado en el historial haciendo clic en 'Nuevo'.\\n\" +\n" +
"                          \"5. Para ver el historial de operaciones realizadas, haga clic en 'Historial'.\\n\" +\n" +
"                          \"6. Para obtener ayuda sobre cómo usar la calculadora, haga clic en 'Ayuda'.\\n");
        
        JScrollPane scrollPane = new JScrollPane(txtAyuda);
        add(scrollPane, BorderLayout.CENTER);
    }
    
}
