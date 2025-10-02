package poly.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserZowick {
	 private String id; 
	 private String fullname; 
	 @Default 
	 private String photo = "logoz.jpg"; 
	 @Default 
	 private Boolean gender = true; 
	 @Default 
	 private Date birthday = new Date(); 
	 @Default 
	 private Integer level = 0; 
	 @Default 
	 private Double salary = 9999999.69; 
}