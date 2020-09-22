package com.nt.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CustomerDTO implements Serializable{

	private String cname;
	private String cadd;
	private float pamt;
	private  float intramt;
	private float rate;
	private float time;
}
