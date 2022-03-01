package com.cydeo.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
@ComponentScan(basePackages ="com.cydeo")
//scan everything under com.cydeo packages
//or you can do below way
//@ComponentScan(basePackages = {"com.cydeo.proxy","com.cydeo.repository","com.cydeo.service"})
public class ProjectConfig {

}
