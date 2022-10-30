package com.tuempresa.vuelo.modelo;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;
 
@Entity @Getter @Setter

public class Persona {
 
    @Id
    @Hidden
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    String oid;
 
    @Column(length=64)
    String nombre;
    
    @Column(length=64)
    String apellido;
    
    @File
    @Column(length=32)
    String fotografia;
    
    @Embedded
    private Direccion direccion;

}