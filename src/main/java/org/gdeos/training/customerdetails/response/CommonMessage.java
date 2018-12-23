package org.gdeos.training.customerdetails.response;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode 
@ToString
@NoArgsConstructor @Getter @Setter
@Data
public class CommonMessage implements Serializable 
{

	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private  String message;
	private  String code;
	private  CustomerDetailsResponse tracingrresponse;
}
