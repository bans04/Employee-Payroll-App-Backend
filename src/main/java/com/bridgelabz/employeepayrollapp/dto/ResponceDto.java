package com.bridgelabz.employeepayrollapp.dto;
import lombok.Data;

@Data
public class ResponceDto {
    private String message;
    private  Object data;

    /**
     * Parameterise constructre
     * @param message
     * @param data
     */
    public ResponceDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    //For getters & Setters we use lombok with @Data notation
}
