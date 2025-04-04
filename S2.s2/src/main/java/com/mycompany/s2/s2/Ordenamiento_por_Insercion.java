/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s2.s2;

/**
 *
 * @author Lincoln_Vega_Hidalgo
 */
public class Ordenamiento_por_Insercion {
    public static void main(String[] args) {
         int[] arr = {11, 13, 14, 15, 12}; 
        System.out.println("Arreglo inicial (desordenado):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        insercion(arr);
        System.out.println("\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + "  "); 
} 
} 
public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j+1] = key;
        }
    }
}
