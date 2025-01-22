/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolistmanager.model;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Task extends Status{
    private final int idTask;
    private final String title;
    private final String description;
    private final Date deadLine;
    
    public Task(int idTask,String title,String description,Date deadLine, int idStatus)
    {
        this.idTask = idTask;
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.idStatus = idStatus;
    }
}
