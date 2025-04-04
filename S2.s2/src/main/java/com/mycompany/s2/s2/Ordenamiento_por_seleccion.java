/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.s2.s2;

/**
 *
 * @author Lincoln_Vega_Hidalgo
 */
public class Ordenamiento_por_seleccion {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; 
        System.out.println("Arreglo inicial (desordenado):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        seleccion(arr);
        System.out.println("\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + "  "); 
} 
} 
public static void seleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];

            arr[i] = temp;
        }
    }
}
