package br.com.zup.dp.data.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private int phone;
}
