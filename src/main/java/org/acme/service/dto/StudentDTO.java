package org.acme.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {

    private Long id;
    private String name;
    private String email;
    private String mobile;
}
