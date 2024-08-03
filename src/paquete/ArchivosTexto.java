/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.io.*;

/**
 *
 * @author Carlo
 */
public class ArchivosTexto {

    File archivo;

    private void crearArchivoDeTexto() {
        archivo = new File("archivo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado con exito");
            } else {
                System.out.println("error");
            }
        } catch (IOException exepcion) {
            exepcion.printStackTrace(System.out);
        }
    }

    private void eliminarArchivoDeTexto() {

        if (archivo.delete()) {
            System.out.println("Archivo eliminado con exito");
        } else {
            System.out.println("error");
        }
    }
    
    private void escribirAlArchivoDeTexto(){
        try {
            FileWriter escritura = new FileWriter(archivo);
            escritura.write("hola");
            escritura.close();
            System.out.println("texto añadido");
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
            }
    
    public static void main(String[] args) {
        ArchivosTexto archivoTexto = new ArchivosTexto();
        archivoTexto.crearArchivoDeTexto();
        archivoTexto.escribirAlArchivoDeTexto();
    }
}
