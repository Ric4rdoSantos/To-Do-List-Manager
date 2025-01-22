/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolistmanager;

import com.mycompany.todolistmanager.model.Task;

/**
 *
 * @author Ricardo
 */
public class ToDoListManager {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Task task = new Task(0,"","","",0);
        // status = new Status();
        System.out.println(task.status);
    }
}
