package com.dev.pub;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
public class AuditFields {
    @Autowired
   private UserService userService;
    private String createdBy;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private Date createdTimestamp=new Date();
    private String modifiedBy;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
   private Date modifiedTimestamp=new Date();

}
