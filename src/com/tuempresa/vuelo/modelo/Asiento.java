package com.tuempresa.vuelo.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Asiento {

	
	@Column(length=6) 
	int numAsiento;
	
	@Money
	BigDecimal costoBoleto;
	
	
	
	
}
