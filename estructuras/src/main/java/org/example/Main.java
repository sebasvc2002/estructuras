package org.example;
import java.io.*;
import java.util.LinkedList;

class nodo {
    int data;
    nodo next;
    nodo(int d) {
        this.data = d;
        this.next = null;
    }
}
class Lista{
    nodo head;

    public void insertarLista(int d){
        nodo newNodo = new nodo(d);
        if (head == null){
            head = newNodo;
        }
        else {
         nodo current = head;
         while (current.next != null){
             current = current.next;
         }
        current.next = newNodo;
        }
    }
    public void mostrarLista(){
        nodo current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void eliminarLista(int d) {
        if (head == null) {
            return;
        }
        if (head.data == d) {
            head = head.next;
            return;
        }
        nodo current = head;
        while (current.next != null && current.next.data != d) {
            current = current.next;
        }
        if (current.next == null) {
            return;
        }
    }
    public void buscarLista(int d){
        nodo current = head;
        while (current != null && current.data <= d){
            if (current.data == d){
                System.out.println("El dato " + d + " se encuentra en la lista");
                return;
            }
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

    }
}