package com.tuempresa.vuelo.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter

@View(members=
"anyo, fecha," +
   "datos{" +
	"asiento;" +
	"persona;" +
	"}"
	)
public class Pasajero {
	
	@Id
    @GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(length=32)
    String oid;
	
	@Column(length=4)
    @DefaultValueCalculator(CurrentYearCalculator.class)
    int anyo;
 
    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;
	
    @Embedded
    private Asiento asiento;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    Persona persona;
    
    

}
