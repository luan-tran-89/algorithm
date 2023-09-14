package com.practice.spring.batch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gasieugru
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {

    private String brand;

    private String origin;

    private String characteristics;

}
